public class Time{
    int hours;
    int minuts;
    int seconds;

    public void setTime(int hours, int minuts, int seconds){
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = seconds;
    }

    public void setTime(int hours, int minuts){
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = 0;
    }

    public void setTime(int hours){
        this.hours = hours;
        this.minuts = 0;
        this.seconds = 0;
    }

    public void setTime(){
        this.hours = 0;
        this.minuts = 0;
        this.seconds = 0;
    }

    public String verHora(){
        return formatarHora(hours)+":"+formatarHora(minuts)+":"+formatarHora(seconds);
    }

    public String formatarHora(int num){
        if(num <= 9){
            return String.valueOf("0"+num);
        }
        return String.valueOf(num);
    }
}













































/* public class Time{
    String hours;
    String minuts;
    String seconds;

    public Time(int hours, int minuts, int seconds){
        if(hours <= 9){
            this.hours = "0"+hours;
        }else{
            this.hours = String.valueOf(hours);
        }
        if(minuts <= 9){
            this.minuts = "0"+minuts;
        }else{
            this.minuts = String.valueOf(minuts);
        }
        if(seconds <= 9){
            this.seconds = "0"+seconds; 
        }else{
            this.seconds = String.valueOf(seconds); 
        }
    }

    public Time(int hours, int minuts){
        if(hours <= 9){
            this.hours = "0"+hours;
        }else{
            this.hours = String.valueOf(hours);
        }
        if(minuts <= 9){
            this.minuts = "0"+minuts;
        }else{
            this.minuts = String.valueOf(minuts);
        }
        this.seconds = "00";
    }

    public Time(int hours){
        if(hours <= 9){
            this.hours = "0"+hours;
        }else{
            this.hours = String.valueOf(hours);
        }
        this.minuts = "00";
        this.seconds = "00";
    }

    public void ver(){
        System.out.println(hours+":"+minuts+":"+seconds);
    }
} */