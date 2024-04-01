package X;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.emoji.EmojiDescriptor;
import java.lang.ref.Reference;

/* renamed from: X.1KX */
/* loaded from: classes.dex */
public class C1KX implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C35221in A01;

    public C1KX(C35221in c35221in, View view) {
        this.A01 = c35221in;
        this.A00 = view;
    }

    public /* synthetic */ void A00(Context context, C02O c02o) {
        C26701Kg c26701Kg = this.A01.A01;
        C26691Kf[] c26691KfArr = c26701Kg.A0R;
        int A00 = c26691KfArr[c26701Kg.A00].A00(context);
        for (int i = 0; i < A00; i++) {
            int[] A01 = c26691KfArr[c26701Kg.A00].A01(c02o, i);
            int A012 = EmojiDescriptor.A01(A01);
            if (A012 < 0) {
                int[] A013 = c26691KfArr[c26701Kg.A00].A01(c02o, i);
                StringBuilder sb = new StringBuilder();
                for (int i2 : A013) {
                    sb.append(Integer.toHexString(i2));
                    sb.append(' ');
                }
                StringBuilder A0P = C000200d.A0P("bad emoji on page ");
                A0P.append(c26701Kg.A00);
                A0P.append(" index ");
                A0P.append(i);
                A0P.append(": ");
                A0P.append((Object) sb);
                C000700j.A08(false, A0P.toString());
            }
            Reference reference = (Reference) C26701Kg.A0X.get(A012);
            if (reference == null || reference.get() == null) {
                Message.obtain(C26701Kg.A0U, 0, A012, 0, new C26681Ke(null, new C43941yG(A01))).sendToTarget();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        C35221in c35221in = this.A01;
        final Context context = c35221in.A00;
        final C02O c02o = c35221in.A03;
        view.post(new Runnable() { // from class: X.1Gm
            {
                C1KX.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1KX.this.A00(context, c02o);
            }
        });
        return true;
    }
}
