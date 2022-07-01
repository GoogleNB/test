package baobao.LIANxi.myproject03.service;

import baobao.LIANxi.myproject03.domain.Architect;
import baobao.LIANxi.myproject03.domain.Designer;
import baobao.LIANxi.myproject03.domain.Employee;
import baobao.LIANxi.myproject03.domain.Programmer;

public class TeamService {
    private static int counter = 1;//给memberID赋值使用
    private final int MAX_MEMBER = 5;//限制开发团队人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;

    public TeamService() {

    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
//        成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

//        该成员不是开发人员，无法添加
         if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
//        该员工已在本开发团队中
          if (isTeam(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }
//        该员工已是某团队成员
//        该员正在休假，无法添加
        Programmer p = (Programmer) e;
      if ("BUSY".equals(p.getStatus().getNAME())) //p.getStatus().getNAME().equals("BUSY")
        {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假，无法添加");
        }
//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfDes >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        //将p或e添加到team中
        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
    }

    private boolean isTeam(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {

        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;

            }
        }
        if (i == total) {
            throw new TeamException("没有找到");
        }
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;

    }
}
