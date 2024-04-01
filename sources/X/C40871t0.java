package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.Map;

/* renamed from: X.1t0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40871t0 extends URLSpan implements InterfaceC02760Ct {
    public int A00;
    public int A01;
    public boolean A02;
    public final C83563sK A03;
    public final String A04;
    public final Map A05;

    public C40871t0(Context context, String str, String str2, Map map, C83563sK c83563sK) {
        super(str);
        this.A04 = str2;
        this.A05 = map;
        this.A03 = c83563sK;
        int A00 = C02160Ac.A00(context, R.color.link_color);
        this.A01 = A00;
        this.A00 = C09990f7.A03(A00, 72);
    }

    @Override // X.InterfaceC02760Ct
    public void APh(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && this.A02) {
            this.A03.A00(this.A04, this.A05);
        }
        this.A02 = motionEvent.getAction() == 0;
        view.invalidate();
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan, X.InterfaceC02760Ct
    public void onClick(View view) {
        this.A03.A00(this.A04, this.A05);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A01);
        textPaint.bgColor = this.A02 ? this.A00 : 0;
        textPaint.setUnderlineText(false);
    }
}
