package Template;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("decode");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("id/password confirm");
        return false;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("autho confirm");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection");
        return null;
    }
}
