package command;

class Client {
    public static void main(String args[]) {
        FBSettingWindow window = new FBSettingWindow("功能键设置");

        FunctionButton fb1, fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键1");

        Command command1, command2;
        //通过读取配置文件和反射生成具体命令对象  
        command1 = new HelpCommand();
        command2 = new MinimizeCommand();

        //将命令对象注入功能键  
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        window.addFunctionButton(fb1);
        window.addFunctionButton(fb2);
        window.display();

        //调用功能键的业务方法  
        fb1.onClick();
        fb2.onClick();

        System.out.println("-------------------------------------");

        CalculatorForm form = new CalculatorForm();
        AbstractCommand command = new ConcreteCommand();

        //向发送者注入命令对象
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}