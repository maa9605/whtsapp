package X;

import android.os.Handler;
import android.os.Looper;
import android.util.JsonReader;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.StringReader;

/* renamed from: X.4Ae */
/* loaded from: classes3.dex */
public abstract class AbstractC90224Ae {
    public final C00J A00;
    public final C00J A01;
    public final C00J A02;
    public final C00J A03;
    public final C00J A04;
    public final C00J A05;
    public final C00J A06;
    public final C00J A07;

    public AbstractC90224Ae(C00J c00j, C00J c00j2, C00J c00j3, C00J c00j4, C00J c00j5, C00J c00j6, C00J c00j7, C00J c00j8) {
        this.A06 = c00j;
        this.A02 = c00j2;
        this.A05 = c00j3;
        this.A00 = c00j4;
        this.A07 = c00j5;
        this.A04 = c00j6;
        this.A03 = c00j7;
        this.A01 = c00j8;
    }

    public static ActivityC02290Ap A00(C021209s c021209s) {
        return ((C892046c) c021209s.A00.get(R.id.bloks_global_bloks_host)).A03;
    }

    public /* synthetic */ void A01(C021209s c021209s) {
        A00(c021209s).onBackPressed();
    }

    public void A02(C021209s c021209s, C09P c09p, C09P c09p2, InputStream inputStream, Exception exc) {
        try {
            if (exc == null) {
                String A0D = AnonymousClass024.A0D(inputStream);
                C91604Fo c91604Fo = new C91604Fo(this, c021209s);
                try {
                    JsonReader jsonReader = new JsonReader(new StringReader(A0D));
                    C33831gX c33831gX = new C33831gX(jsonReader);
                    c33831gX.AGm();
                    C45Q.A0A();
                    C45W c45w = new C45W();
                    if (c33831gX.A01 != C0AM.START_OBJECT) {
                        c33831gX.AUv();
                        c45w = null;
                    } else {
                        while (c33831gX.AGm() != C0AM.END_OBJECT) {
                            String str = c33831gX.A02;
                            c33831gX.AGm();
                            if ("layout".equals(str)) {
                                C25311Ew c25311Ew = C09M.A00().A09;
                                c45w.A00 = (AnonymousClass080) ((InterfaceC25301Ev) c25311Ew.A00.get(AnonymousClass080.class)).AQZ(c33831gX, c25311Ew);
                            }
                            c33831gX.AUv();
                        }
                    }
                    new Handler(Looper.getMainLooper()).post(new RunnableC56552nX(c45w, c91604Fo));
                    jsonReader.close();
                } catch (Exception e) {
                    Log.e("Error when parsing bloks payload json", e);
                    String message = e.getMessage();
                    A00(c91604Fo.A00);
                    C74993eB c74993eB = new C74993eB(C000200d.A0H("Bloks: AsyncAction error - ", message));
                    Log.e(c74993eB);
                    c74993eB.getMessage();
                }
                C44J.A00(new RunnableC75053eH(c021209s, c09p));
                return;
            }
            throw exc;
        } catch (Exception unused) {
            C44J.A00(new RunnableC75043eG(c021209s, c09p2));
        }
    }
}
