package java.lang;

import X.AnonymousClass012;
import X.C000200d;
import X.C000500h;
import X.C02A;
import X.C0FH;
import X.C0KF;
import X.C2H2;
import X.C2L3;
import X.C2N6;
import X.C454321z;
import X.C60052tq;
import X.C79883mN;
import X.RunnableC62782yY;
import android.app.Application;
import android.app.backup.BackupManager;
import android.location.Address;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.util.Log;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S1200000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableEBaseShape1S1200000_I1(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        byte[][] bArr2;
        int i;
        int i2;
        String str;
        switch (this.A03) {
            case 0:
                C60052tq c60052tq = (C60052tq) this.A01;
                String str2 = this.A02;
                for (C2N6 c2n6 : ((C2L3) this.A00).A0E) {
                    c2n6.AKI(c60052tq, str2);
                }
                return;
            case 1:
                RunnableC62782yY runnableC62782yY = (RunnableC62782yY) this.A00;
                Address address = (Address) this.A01;
                String str3 = this.A02;
                if (address != null) {
                    if (address.getMaxAddressLineIndex() >= 0) {
                        runnableC62782yY.A02.A1J.A06 = address.getAddressLine(0);
                    }
                    C2H2 c2h2 = runnableC62782yY.A02;
                    c2h2.A1J.A04 = str3;
                    if (address.getLocality() != null && !TextUtils.isEmpty(address.getLocality())) {
                        c2h2.A0k = address.getLocality();
                    }
                }
                C2H2 c2h22 = runnableC62782yY.A02;
                TextView textView = (TextView) c2h22.A0X.findViewById(R.id.map_center_address);
                TextView textView2 = (TextView) c2h22.A0G.findViewById(R.id.location_description);
                if (c2h22.A0t) {
                    str = c2h22.A0k;
                } else {
                    PlaceInfo placeInfo = c2h22.A1J;
                    str = placeInfo.A06;
                    if (str == null) {
                        str = placeInfo.A04;
                    }
                }
                if (textView != null) {
                    textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
                    textView.setText(str);
                }
                if (textView2 != null) {
                    textView2.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
                    textView2.setText(str);
                }
                c2h22.A0C();
                return;
            case 2:
                byte[] bArr3 = (byte[]) this.A01;
                String str4 = this.A02;
                C454321z c454321z = ((C79883mN) this.A00).A00;
                Application application = c454321z.A01.A00;
                AnonymousClass012 anonymousClass012 = c454321z.A00;
                C000500h c000500h = c454321z.A02;
                StringBuilder sb = new StringBuilder();
                sb.append(C0FH.A0I);
                sb.append(str4.substring(Math.max(str4.length() - 4, 0)));
                String obj = sb.toString();
                byte[] bArr4 = C0KF.A01;
                try {
                    byte[] A0C = C02A.A0C(4);
                    byte[] A0C2 = C02A.A0C(16);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(C0KF.A05(obj, A0C), "AES/OFB/NoPadding");
                    Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
                    cipher.init(1, secretKeySpec, new IvParameterSpec(A0C2));
                    byte[] doFinal = cipher.doFinal(bArr3);
                    bArr = new byte[bArr4.length + A0C.length + A0C2.length + doFinal.length];
                    bArr2 = new byte[][]{bArr4, A0C, A0C2, doFinal};
                    i = 0;
                    i2 = 0;
                } catch (Exception e) {
                    Log.e("BackupTokenUtils/encrypt/unable to encrypt", e);
                    bArr = null;
                }
                while (true) {
                    byte[] bArr5 = bArr2[i];
                    System.arraycopy(bArr5, 0, bArr, i2, bArr5.length);
                    i2 += bArr5.length;
                    i++;
                    if (i >= 4) {
                        synchronized (C0KF.A00) {
                            try {
                                C02A.A07(bArr, C0KF.A00(application));
                            } catch (IOException e2) {
                                Log.e("BackupTokenUtils/setBackupToken/unable to write to file", e2);
                            }
                        }
                        new BackupManager(application).dataChanged();
                        C000200d.A0h(c000500h, "backup_token_file_timestamp", anonymousClass012.A05());
                        return;
                    }
                }
            default:
                return;
        }
    }
}
