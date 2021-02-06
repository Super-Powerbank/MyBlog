package Book_Management;

    public class People extends Object{
        private String id;//账号
        private String passwd;//密码

        public People(String id, String passwd) {
            this.id = id;
            this.passwd = passwd;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof People) {
                People people = (People)obj;
                if(this.id.equals(people.id) && this.passwd.equals(people.passwd)){
                    return true;
                }
            }
            return false;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPasswd() {
            return passwd;
        }

        public void setPasswd(String passwd) {
            this.passwd = passwd;
        }
    }
