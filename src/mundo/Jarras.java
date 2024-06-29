package mundo;

import gfutria.Logic;

public class Jarras extends Logic
{ private int jarra6, jarra8;

  public Jarras() { }

  public Jarras(int jarra6, int jarra8) 
  { this.jarra6 = jarra6;
    this.jarra8 = jarra8;
  }

  public int getJarra6() { return jarra6; }
  public void setJarra6(int jarra6) { this.jarra6 = jarra6; }

  public int getJarra8() { return jarra8; }
  public void setJarra8(int jarra8) { this.jarra8 = jarra8; }
  
  public void llenar6()
  { if (jarra6 < 6)
        jarra6 = 6;
  }        
  
  public void llenar8()
  { if (jarra8 < 8)
        jarra8 = 8;      
  }        
  
  public void descargar6()
  { if (jarra6 > 0)
        jarra6 = 0;
  }        

  public void descargar8()
  { if (jarra8 > 0)
        jarra8 = 0;
  }        
    
  public void vaciar8en6()
  { if (jarra6>=6){
      jarra8 = jarra8;
  }else{
      int jarratemp;
      jarratemp = 0;
      if (jarra8 > 0)
        jarratemp = jarra6;
        jarra6 = jarra6+jarra8;
        if (jarra6 > 6){
            jarra6 = 6;
        }
        
        jarra8=(jarratemp+jarra8)-jarra6;
        if (jarra8 < -1){
            jarra8  =0;
        }
  }
  }        

  public void vaciar6en8()
  { if (jarra8>=8){
      jarra6=jarra6;
  }else{
      int jarratemp;
      jarratemp = 0;
      if (jarra6 > 0){
        jarratemp = jarra8;
        jarra8 = jarra8+jarra6;
        
        if (jarra8 > 8){
            jarra8 = 8;
        }
        
        jarra6=(jarratemp+jarra6)-jarra8;
        if (jarra6 < -1){
            jarra6  =0;
        }
      }
  }
  }
  
  public void llenar6con8()
  {if (jarra6>=6){
      jarra8=jarra8;
  }else{
      int jarratemp;
      jarratemp =0;
      if (jarra8 > 0)
        jarratemp = jarra6;
        jarra6 = jarra6+jarra8;
        if (jarra6 > 6){
            jarra6 = 6;
        }
        
        jarra8=(jarratemp+jarra8)-jarra6;
        if (jarra8 < -1){
            jarra8  =0;
        }
  }
  }        

  public void llenar8con6()
  {if (jarra8>=8){
      jarra6=jarra6;
  }else{
      int jarratemp;
      jarratemp = 1;
      if (jarra6 > 0){
        jarratemp = jarra8;
        jarra8 = jarra8+jarra6;
        
        if (jarra8 > 8){
            jarra8 = 8;
        }
        
        jarra6=(jarratemp+jarra6)-jarra8;
        if (jarra6 < -1){
            jarra6  =0;
        }
      }
  }
  }

    @Override
    public Logic cloneObject(Logic logic) {
        Jarras objJarras = (Jarras)logic;
        Jarras cloJarras = new Jarras();
        
        cloJarras.setJarra6(objJarras.getJarra6());
        cloJarras.setJarra8(objJarras.getJarra8());
        return cloJarras;
    }

    @Override
    public String state() {
        return jarra6 + " , " + jarra8;
    }

    @Override
    public void action(int i) {
        switch (i){
            case 1: llenar6(); break;
            case 2: llenar8(); break;
            case 3: descargar6(); break;
            case 4: descargar8(); break;
            case 5: vaciar6en8(); break;
            case 6: vaciar8en6(); break;
            case 7: llenar6con8(); break;
            case 8: llenar8con6(); break;
        }
    }
  }
