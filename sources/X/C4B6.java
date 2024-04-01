package X;

import java.io.Serializable;

/* renamed from: X.4B6  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4B6 implements Serializable {
    public String code;
    public String encryptedBase64String;
    public String hmac;
    public String ki;
    public String pid;
    public String type;

    public C4B6(String str, String str2, String str3) {
        this.ki = str;
        this.code = str2;
        this.encryptedBase64String = str3;
    }
}
