package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3GB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3GB implements C2zH {
    public final C2zH A00;
    public final C0DC A01;
    public final String A02;
    public final String A03;
    public final MessageDigest A04;
    public final MessageDigest A05;

    public C3GB(C2zH c2zH, String str, String str2, C0DC c0dc) {
        MessageDigest messageDigest;
        this.A00 = c2zH;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c0dc;
        MessageDigest messageDigest2 = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("encryptedstreamdownload/digest error", e);
            messageDigest = null;
        }
        this.A05 = messageDigest;
        try {
            messageDigest2 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e2) {
            Log.e("encryptedstreamdownload/digest error", e2);
        }
        this.A04 = messageDigest2;
    }

    @Override // X.C2zH
    public OutputStream AQY(InterfaceC02170Ad interfaceC02170Ad) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = this.A05;
        if (messageDigest2 != null && (messageDigest = this.A04) != null) {
            return new DigestOutputStream(new C59862tX(new DigestOutputStream(this.A00.AQY(interfaceC02170Ad), messageDigest), C42041uv.A03(C002701i.A1Y(Base64.decode(this.A02, 0), this.A01.A03, 80)), interfaceC02170Ad.getContentLength()), messageDigest2);
        }
        throw new C63122zA(1);
    }
}
