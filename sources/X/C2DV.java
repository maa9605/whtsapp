package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2DV  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2DV {
    public static final long A09 = TimeUnit.MINUTES.toMillis(15);
    public static volatile C2DV A0A;
    public long A00;
    public boolean A01;
    public final C001200o A02;
    public final C41451tw A03;
    public final C004902f A04;
    public final InterfaceC002901k A05;
    public final List A08 = new ArrayList();
    public final List A07 = new ArrayList();
    public final List A06 = new ArrayList();

    public C2DV(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, C41451tw c41451tw) {
        this.A02 = c001200o;
        this.A04 = c004902f;
        this.A05 = interfaceC002901k;
        this.A03 = c41451tw;
    }

    public static C2DV A00() {
        if (A0A == null) {
            synchronized (C2DV.class) {
                if (A0A == null) {
                    A0A = new C2DV(C001200o.A01, C004902f.A00(), C002801j.A00(), C41451tw.A00());
                }
            }
        }
        return A0A;
    }

    public final synchronized void A01() {
        String[] split;
        if (this.A01) {
            return;
        }
        List list = this.A08;
        list.clear();
        this.A07.clear();
        this.A06.clear();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.A02.A00.getResources().openRawResource(R.raw.domain_fronting_providers), "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        try {
                            split = TextUtils.split(readLine.replaceAll("\t", " ").replaceAll("^ +| +$|( )+", "$1"), " ");
                        } catch (IllegalArgumentException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("domain-fronting-providers/load/bad-line: ");
                            sb.append(readLine);
                            Log.e(sb.toString(), e);
                        }
                        if (split != null && split.length >= 3) {
                            list.add(new C47942De(this.A04, split));
                        } else {
                            throw new IllegalArgumentException();
                            break;
                        }
                    } else {
                        bufferedReader.close();
                        break;
                    }
                } finally {
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        this.A01 = true;
    }
}
