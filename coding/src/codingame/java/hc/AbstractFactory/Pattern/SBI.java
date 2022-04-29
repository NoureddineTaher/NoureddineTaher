package codingame.java.hc.AbstractFactory.Pattern;

class SBI implements Bank{  
    private final String BNAME;  
    public SBI(){  
              BNAME="SBI BANK";  
      }  
     public String getBankName(){  
                return BNAME;  
     }  
} 