package Template;


//보안 > 인증 > 권한 > 접속
public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // 템플릿
    public String requestConnection(String str) {
        //보안 작업 -> 암호환 된 문자열을 복호화
        String decodedInfo = doSecurity(str);

        String id = "aaa";
        String password = "bbb";
        //인증 작업 ->
      /*  if(!authentication(id, password)) {
            throw new Error("id/pass not");
        }*/

        String userName = "";
        //권한 작업
        int i = authorization(userName);
        switch(i) {
            case 0:
                System.out.println("game manager");
                break;
            case 1:
                System.out.println("money mamber");
                break;
            case 2:
                System.out.println("non money member");
                break;
            case 3:
                System.out.println("no ahoto");
                break;
            default:
                break;
        }

        return connection(decodedInfo);
    }
}
