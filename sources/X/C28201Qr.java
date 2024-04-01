package X;

import java.io.Serializable;

/* renamed from: X.1Qr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28201Qr implements Serializable {
    public static final long serialVersionUID = -8570787049995872919L;
    public String attachmentParam;
    public String attachmentPath;
    public boolean detailedException;
    public boolean forcedUpload;
    public String fromParam;
    public String logFilePath;
    public String tagsString;
    public long timeMillis;

    public C28201Qr(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, long j) {
        this.logFilePath = str;
        this.attachmentPath = str2;
        this.fromParam = str3;
        this.forcedUpload = z;
        this.detailedException = z2;
        this.tagsString = str4;
        this.attachmentParam = str5;
        this.timeMillis = j;
    }
}
