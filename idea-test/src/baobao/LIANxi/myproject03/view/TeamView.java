package baobao.LIANxi.myproject03.view;

import baobao.LIANxi.myproject03.domain.Employee;
import baobao.LIANxi.myproject03.domain.Programmer;
import baobao.LIANxi.myproject03.service.NameListServer;
import baobao.LIANxi.myproject03.service.TeamException;
import baobao.LIANxi.myproject03.service.TeamService;

public class TeamView {
    private NameListServer listSvc = new NameListServer();
    private TeamService teamSvc = new TeamService();

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }

    private void enterMainMenu() {
        boolean loopFlag = true;
        char meum = 0;
        while (loopFlag) {
            if (meum != '1') {
                listAllEmployees();
            }

            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            meum = TSUtility.readMenuSelection();

            switch (meum) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("是否要退出Y/N");
                    char c = TSUtility.readConfirmSelection();
                    if (c == 'Y') {
                        loopFlag = false;
                    }

                    break;

            }
        }
    }

    private void listAllEmployees() {
//显示所有员工信息
        System.out.println("\n-------------------------------开发团队调度软件--------------------------------\n");
        Employee[] allEmployee = listSvc.getAllEmployee();
        if (allEmployee.length == 0 || allEmployee == null) {
            System.out.println("没有员工");
        } else {
            System.out.println("ID \t姓名 \t年龄\t工资 \t职位 \t状态 \t奖金 \t股票 \t领用设备");
        }
        for (Employee i : allEmployee) {
            System.out.println(" " + i);
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    private void getTeam() {
//查看开发团队
        System.out.println("\n--------------------团队成员列表---------------------\n");
        Programmer[] team = teamSvc.getTeam();
        if (team.length == 0 || team == null) {
            System.out.println("没有成员");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
        }
        for (Programmer i : team) {
            System.out.println(i.getDetailsForTeam());
        }
        System.out.println("-----------------------------------------------------");
    }

    private void addMember() {
//添加团队成员
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = listSvc.getEmployee(id);
            teamSvc.addMember(employee);
            System.out.println("添加成功");

        } catch (TeamException e) {
            System.out.println("添加失败，原因："+e.getMessage());
        }
        TSUtility.readReturn();
    }

    private void deleteMember() {
//删除团队成员
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int id = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N)：");
        char yn = TSUtility.readConfirmSelection();
        if (yn == 'n') {
            return;
        }
        try {
            teamSvc.removeMember(id);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        TSUtility.readReturn();
    }

}
