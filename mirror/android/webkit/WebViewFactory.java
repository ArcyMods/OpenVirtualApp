package mirror.android.webkit;

import mirror.RefClass;
import mirror.RefStaticMethod;
import mirror.RefStaticObject;

public class WebViewFactory {
  public static Class<?> TYPE = RefClass.load(WebViewFactory.class, "android.webkit.WebViewFactory");
  
  public static RefStaticMethod<Object> getUpdateService;
  
  public static RefStaticObject<Boolean> sWebViewSupported;
}


/* Location:              F:\何章易\项目文件夹\项目24\va\classes_merge.jar!\mirror\android\webkit\WebViewFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */