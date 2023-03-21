public class tv {

        private String owner;
        private String date;
        private String damage;
        private String tvbrand;


        public tv ( String owner,String date,String damage,String tvbrand){

                this.owner = owner;
                this.date = date;
                this.damage = damage;
                this.tvbrand = tvbrand;
        }

        public String getDamage() {
                return damage;
        }

        public void setDamage(String damage) {
                this.damage = damage;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }

        public String getOwner() {
                return owner;
        }

        public void setOwner(String owner) {
                this.owner = owner;
        }

        public String getTvbrand() {
                return tvbrand;
        }

        public void setTvbrand(String tvbrand) {
                this.tvbrand = tvbrand;
        }
}
