package responsibility;

class Client {
    public static void main(String[] args) {
        Approver director = new Director("张主任");
        Approver vicePresident = new VicePresident("李副董事");
        Approver president = new President("王董事");
        Approver congress = new Congress("董事会");

        //创建职责链  
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        //创建采购单  
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        director.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        director.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        director.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        director.processRequest(pr4);
    }
}