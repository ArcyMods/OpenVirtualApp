package mirror.com.android.internal.app;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

public class ISmtOpsService {
  public static Class<?> TYPE = RefClass.load(ISmtOpsService.class, "com.android.internal.app.ISmtOpsService");
  
  public static class Stub {
    public static Class<?> TYPE = RefClass.load(Stub.class, "com.android.internal.app.ISmtOpsService$Stub");
    
    @MethodParams({IBinder.class})
    public static RefStaticMethod<IInterface> asInterface;
  }
}


/* Location:              F:\何章易\项目文件夹\项目24\va\classes_merge.jar!\mirror\com\android\internal\app\ISmtOpsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */