package custom;

public class HandlingCustom {
    public static void main(String[] args) {

        try{
            throw new CustomException("this is a custom exception");
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }


}
