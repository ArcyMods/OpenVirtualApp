package mirror.oem.vivo;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

public class ISystemDefenceManager {
  public static Class<?> TYPE = RefClass.load(ISystemDefenceManager.class, "vivo.app.systemdefence.ISystemDefenceManager");
  
  public static class Stub {
    public static Class<?> TYPE = RefClass.load(Stub.class, "vivo.app.systemdefence.ISystemDefenceManager$Stub");
    
    @MethodParams({IBinder.class})
    public static RefStaticMethod<IInterface> asInterface;
  }
}


/* Location:              F:\何章易\项目文件夹\项目24\va\classes_merge.jar!\mirror\oem\vivo\ISystemDefenceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */