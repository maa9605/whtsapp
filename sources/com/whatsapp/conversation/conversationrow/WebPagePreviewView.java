package com.whatsapp.conversation.conversationrow;

import X.C002301c;
import X.C01B;
import X.C02160Ac;
import X.C05920Qu;
import X.C07O;
import X.C0AT;
import X.C0ED;
import X.C0JJ;
import X.C0WZ;
import X.C26901Le;
import X.C2XV;
import X.C38D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* loaded from: classes2.dex */
public class WebPagePreviewView extends C2XV {
    public View A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C01B A06;
    public ThumbnailButton A07;
    public C002301c A08;
    public C0WZ A09;
    public C0ED A0A;

    public WebPagePreviewView(Context context) {
        super(context);
        A00(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public final void A00(Context context) {
        FrameLayout.inflate(context, R.layout.web_page_preview, this);
        this.A02 = (ProgressBar) C0AT.A0D(this, R.id.progress);
        this.A04 = (TextView) C0AT.A0D(this, R.id.title);
        this.A07 = (ThumbnailButton) C0AT.A0D(this, R.id.thumb);
        this.A01 = (FrameLayout) C0AT.A0D(this, R.id.large_thumb_frame);
        this.A05 = (TextView) C0AT.A0D(this, R.id.url);
        this.A00 = C0AT.A0D(this, R.id.gif_size_bullet);
        this.A03 = (TextView) C0AT.A0D(this, R.id.gif_size);
        Drawable A03 = C02160Ac.A03(context, R.drawable.balloon_incoming_frame);
        if (A03 != null) {
            Drawable A0I = C07O.A0I(A03.mutate());
            C07O.A0X(A0I, C02160Ac.A00(context, R.color.bubble_color_incoming));
            setForeground(A0I);
            if (getId() == -1) {
                setId(R.id.link_preview_frame);
                return;
            }
            return;
        }
        throw null;
    }

    public void A01(C05920Qu c05920Qu, List list) {
        int i;
        String str = c05920Qu.A0D;
        String str2 = c05920Qu.A0A;
        String str3 = TextUtils.isEmpty(c05920Qu.A09) ? c05920Qu.A0G : c05920Qu.A09;
        byte[] bArr = c05920Qu.A0F;
        String str4 = c05920Qu.A0G;
        C26901Le c26901Le = c05920Qu.A07;
        if (c26901Le != null) {
            i = c26901Le.A00;
        } else {
            i = -1;
        }
        A03(str, str2, str3, bArr, str4, false, list, i, c05920Qu.A0D(), c05920Qu instanceof C38D);
    }

    public final void A02(C0JJ c0jj, String str, String str2, String str3, List list, boolean z) {
        A03(c0jj.A04, c0jj.A02, str, c0jj.A1D(), str3, this.A09.A01(c0jj, str2, c0jj.A0B()) != null, list, -1, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0019, code lost:
        if (android.text.TextUtils.isEmpty(com.whatsapp.AcceptInviteLinkActivity.A00(android.net.Uri.parse(r17))) != false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0106  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(java.lang.String r13, java.lang.String r14, java.lang.String r15, byte[] r16, java.lang.String r17, boolean r18, java.util.List r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.WebPagePreviewView.A03(java.lang.String, java.lang.String, java.lang.String, byte[], java.lang.String, boolean, java.util.List, int, boolean, boolean):void");
    }

    public void setLargeThumbFrameVisibility(boolean z) {
        this.A01.setVisibility(z ? 0 : 8);
    }

    public void setProgressBarVisibility(boolean z) {
        this.A02.setVisibility(z ? 0 : 8);
    }

    private void setTitle(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }
}
