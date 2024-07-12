package coreJava;

public class exception {
    public static void main(String[] args) {
        try{
            int[] a = {1,3,4,5,6,8};
            System.out.println(a[6]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getStackTrace());
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("close browser"); // it will execute no matter whether ur test pass or fail (in automation we need this to close browser irrespective of pass or fail to make test ready for next run)
        }
    }
}
