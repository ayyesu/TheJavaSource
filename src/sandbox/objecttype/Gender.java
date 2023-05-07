package src.sandbox.objecttype;

public enum Gender {
    FEMALE(1, "f"),
    MALE(2, "m"),
    UNDEFINED(3, "u"){
        @Override
        public String comment(){
            return "To be decided later: " + getRepr() + "," + getDesc();
        }
    };

    private int repr;
    private String desc;

    Gender(int repr, String desc) {
        this.repr = repr;
        this.desc = desc;
    }
    public int getRepr(){
        return this.repr;
    }
    public String getDesc(){
        return this.desc;
    }
    public String comment(){
        return getRepr() + " : " + getDesc();
    }
}
