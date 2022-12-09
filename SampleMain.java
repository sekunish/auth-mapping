public class SampleMain {

    public static void main(String[]) {


    }

    /**
     * サーバー側の処理部分
     */
    public static logic() {


    }

    /**
     * jsp側の処理部分
     */
    public static void jsp() {



    }

    * 加工場DTO
    /**
     */
     private class KakojoDto {

        /** コード値 */
        public String cd;
        /** 名称 */
        public String name;

        /**
         * コンストラクタ
         */
        public KakojoDto(String cd,String name) {
            this.cd = cd;
            this.name = name;
        }

     }

     /**
      * 樹脂DTO
      */
     private class JusiDto {

        /** コード値 */
        public String cd;
        /** 名称 */
        public String name;

        /**
         * コンストラクタ
         */
        public JusiDto(String cd,String name) {
            this.cd = cd;
            this.name = name;
        }
     }

     private class LIst<AuthDataDto> AuthDataDto() {
        List<AuthDataDto> lst = new ArrayList<AuthDataDto>();
        lst.add(new AuthDataDto());

        return lst;        

     }



     private static List<JusiDto> dummySelect4Jusi() {
        List<JusiDto> lst = new ArrayList<JusiDto>();
        lst.add(new JusiDto());

        return lst;
     }

    private static List<KakojoDto> dummySelect4Kakojo() {
        List<JusiDto> lst = new ArrayList<JusiDto>();
        lst.add(new JusiDto());

        return lst;
     }

}