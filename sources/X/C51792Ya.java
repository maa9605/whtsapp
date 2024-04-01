package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2Ya */
/* loaded from: classes2.dex */
public class C51792Ya extends LinearLayout implements AnonymousClass005 {
    public C002301c A00;
    public C2UB A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;

    public C51792Ya(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            ((AbstractC07960aN) generatedComponent()).A2P(this);
        }
        this.A02 = false;
        setOrientation(1);
        setGravity(16);
        LinearLayout.inflate(getContext(), R.layout.file_attachment_metadata, this);
        View findViewById = findViewById(R.id.file_attachment_metadata_title);
        if (findViewById != null) {
            this.A08 = (TextEmojiLabel) findViewById;
            View findViewById2 = findViewById(R.id.file_attachment_metadata_description);
            if (findViewById2 != null) {
                this.A06 = (TextEmojiLabel) findViewById2;
                View findViewById3 = findViewById(R.id.file_attachment_metadata_subtext);
                if (findViewById3 != null) {
                    this.A07 = (TextEmojiLabel) findViewById3;
                    this.A04 = C02160Ac.A00(context, R.color.list_item_sub_title);
                    this.A05 = C02160Ac.A00(context, R.color.list_item_title);
                    C003301p.A06(this.A08);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A01;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A01 = c2ub;
        }
        return c2ub.generatedComponent();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.A02 = true;
        TextEmojiLabel textEmojiLabel = this.A08;
        measureChild(textEmojiLabel, i, i2);
        setupTitleAndDescriptionMaxLines(textEmojiLabel.getText().toString());
        super.onMeasure(i, i2);
    }

    public void setSubText(String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A07;
        textEmojiLabel.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        textEmojiLabel.A06(AbstractC54772jK.A01(getContext(), str, list, this.A00), null, false, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x001a, code lost:
        if (r6.A08.getMeasuredWidth() != 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTitleAndDescription(java.lang.String r7, java.lang.String r8, java.util.List r9) {
        /*
            r6 = this;
            com.whatsapp.TextEmojiLabel r5 = r6.A06
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            r0 = 0
            if (r1 == 0) goto Lc
            r0 = 8
        Lc:
            r5.setVisibility(r0)
            boolean r0 = r6.A02
            if (r0 != 0) goto L1c
            com.whatsapp.TextEmojiLabel r0 = r6.A08
            int r1 = r0.getMeasuredWidth()
            r0 = 0
            if (r1 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            r6.A02 = r0
            if (r0 == 0) goto L24
            r6.setupTitleAndDescriptionMaxLines(r7)
        L24:
            if (r9 == 0) goto L54
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L54
            com.whatsapp.TextEmojiLabel r3 = r6.A08
            int r0 = r6.A04
            r3.setTextColor(r0)
        L33:
            android.content.Context r1 = r6.getContext()
            X.01c r0 = r6.A00
            java.lang.CharSequence r0 = X.AbstractC54772jK.A01(r1, r7, r9, r0)
            r2 = 0
            r3.A06(r0, r2, r4, r4)
            if (r8 == 0) goto L51
            android.content.Context r1 = r6.getContext()
            X.01c r0 = r6.A00
            java.lang.CharSequence r0 = X.AbstractC54772jK.A01(r1, r8, r9, r0)
        L4d:
            r5.A06(r0, r2, r4, r4)
            return
        L51:
            java.lang.String r0 = ""
            goto L4d
        L54:
            com.whatsapp.TextEmojiLabel r3 = r6.A08
            int r0 = r6.A05
            r3.setTextColor(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51792Ya.setTitleAndDescription(java.lang.String, java.lang.String, java.util.List):void");
    }

    private void setupTitleAndDescriptionMaxLines(String str) {
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel.getPaint().measureText(str) > textEmojiLabel.getMeasuredWidth()) {
            textEmojiLabel.setMaxLines(2);
            this.A06.setMaxLines(1);
            return;
        }
        textEmojiLabel.setMaxLines(1);
        this.A06.setMaxLines(2);
    }
}
