package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.47D  reason: invalid class name */
/* loaded from: classes3.dex */
public final class C47D extends AbstractC30911bN {
    public final /* synthetic */ C016807u A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47D(C016807u c016807u, AnonymousClass087 anonymousClass087, C016807u c016807u2) {
        super(c016807u, anonymousClass087);
        this.A00 = c016807u2;
    }

    @Override // X.AbstractC30911bN, X.AbstractC016307p
    public Object A07(Context context) {
        return View.inflate(context, R.layout.count_down_timer, null);
    }

    @Override // X.AbstractC30911bN
    public View A08(Context context) {
        return View.inflate(context, R.layout.count_down_timer, null);
    }

    @Override // X.AbstractC30911bN
    public void A0A(View view, final AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        C016807u c016807u2 = this.A00;
        final long A00 = C45Q.A00(c016807u2);
        if (A00 > 0) {
            ((TextView) view.findViewById(R.id.start_message)).setText((String) c016807u2.A00.A00(AnonymousClass464.A02));
            final TextView textView = (TextView) view.findViewById(R.id.timer_text);
            final C890245j c890245j = (C890245j) AnonymousClass088.A0o(anonymousClass087, c016807u2);
            c890245j.A00 = new CountDownTimer(A00) { // from class: X.45i
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    AnonymousClass087 anonymousClass0872 = anonymousClass087;
                    C020209i A0a = AnonymousClass088.A0a(anonymousClass0872);
                    C016807u c016807u3 = C47D.this.A00;
                    A0a.A03(((AbstractC016907v) c016807u3).A00, new AbstractC25291Eu() { // from class: X.46g
                        @Override // X.AbstractC25291Eu
                        public void A00(InterfaceC017107x interfaceC017107x) {
                            ((C016807u) interfaceC017107x).A00.A02(AnonymousClass464.A00, 0L);
                        }
                    });
                    A0a.A02();
                    C09P AA3 = c016807u3.AA3(AnonymousClass464.A01);
                    if (AA3 != null) {
                        int i = ((AbstractC016907v) c016807u3).A00;
                        ArrayList arrayList = new ArrayList();
                        InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u3);
                        if (arrayList.size() == 0) {
                            arrayList.add(A0f);
                            C25031Du.A00(i, AA3, new C021109r(arrayList), anonymousClass0872);
                            return;
                        }
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j) {
                    textView.setText(AnonymousClass029.A0g(c890245j.A01, j / 1000));
                }
            }.start();
        }
    }

    @Override // X.AbstractC30911bN
    public void A0B(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        C890245j c890245j = (C890245j) AnonymousClass088.A0o(anonymousClass087, this.A00);
        CountDownTimer countDownTimer = c890245j.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            c890245j.A00 = null;
        }
        ((TextView) view.findViewById(R.id.start_message)).setText("");
        ((TextView) view.findViewById(R.id.timer_text)).setText("");
    }
}
