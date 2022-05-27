package mirror.android.content;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

public class ContentProviderNative {
  public static Class<?> TYPE = RefClass.load(ContentProviderNative.class, "android.content.ContentProviderNative");
  
  @MethodParams({IBinder.class})
  public static RefStaticMethod<IInterface> asInterface;
}


/* Location:              F:\何章易\项目文件夹\项目24\va\classes_merge.jar!\mirror\android\content\ContentProviderNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */