package X;

import android.graphics.Paint;
import com.google.android.search.verification.client.R;

/* renamed from: X.38p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C658038p {
    public int A00;
    public final Paint A01 = new Paint();
    public final C001200o A02;
    public final C002301c A03;

    public C658038p(C001200o c001200o, C002301c c002301c) {
        this.A02 = c001200o;
        this.A03 = c002301c;
        int color = c001200o.A00.getResources().getColor(R.color.conversationRowSelectionColor);
        this.A00 = color;
        this.A01.setColor(color);
        this.A01.setStyle(Paint.Style.FILL);
        this.A01.setAntiAlias(true);
    }
}
