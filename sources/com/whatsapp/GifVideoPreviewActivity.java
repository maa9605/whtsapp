package com.whatsapp;

import X.AbstractC005302j;
import X.AnonymousClass011;
import X.AnonymousClass241;
import X.C000200d;
import X.C002701i;
import X.C003101m;
import X.C003701t;
import X.C018608r;
import X.C018708s;
import X.C02180Ae;
import X.C02E;
import X.C02O;
import X.C04580Kz;
import X.C05W;
import X.C09H;
import X.C0HA;
import X.C0W2;
import X.C2MI;
import X.C36891lX;
import X.C37231m5;
import X.C3ZX;
import X.C41491u0;
import X.C41961un;
import X.C455822q;
import X.C47212Ai;
import X.C47682Ce;
import X.C49292Jm;
import X.InterfaceC002901k;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.jid.Jid;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class GifVideoPreviewActivity extends C0W2 {
    public View A00;
    public View A01;
    public ImageView A02;
    public C018608r A03;
    public C05W A04;
    public C018708s A05;
    public C02E A06;
    public C47682Ce A07;
    public C2MI A08;
    public C003701t A09;
    public C0HA A0A;
    public AnonymousClass011 A0B;
    public C49292Jm A0C;
    public C455822q A0D;
    public C47212Ai A0E;
    public C41491u0 A0F;
    public C02O A0G;
    public C3ZX A0H;
    public C41961un A0I;
    public InterfaceC002901k A0J;
    public VideoSurfaceView A0K;
    public String A0L;
    public boolean A0M;

    public static Intent A00(Activity activity, List list, String str, String str2, String str3, int i, boolean z, boolean z2, int i2) {
        return new Intent(activity, GifVideoPreviewActivity.class).putExtra("preview_media_url", str).putExtra("media_url", str2).putExtra("static_preview_url", str3).putExtra("jids", C003101m.A0E(list)).putExtra("send", z2).putExtra("provider", i).putExtra("number_from_url", z).putExtra("origin", i2);
    }

    public void A1P(int i) {
        Uri parse;
        byte[] A03;
        int i2;
        this.A0K.A03(false);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
        if (stringArrayListExtra.isEmpty()) {
            stringArrayListExtra = new ArrayList<>(1);
            stringArrayListExtra.add(getIntent().getStringExtra("jid"));
        }
        List A0F = C003101m.A0F(AbstractC005302j.class, stringArrayListExtra);
        if (getIntent().getBooleanExtra("send", false)) {
            C09H c09h = new C09H();
            String str = this.A0L;
            if (str != null) {
                File file = new File(str);
                c09h.A0F = file;
                A03 = C02180Ae.A1b(file);
                parse = null;
            } else {
                parse = Uri.parse(getIntent().getStringExtra("media_url"));
                c09h.A08 = getIntent().getIntExtra("media_width", -1);
                c09h.A06 = getIntent().getIntExtra("media_height", -1);
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                A03 = stringExtra != null ? this.A0D.A03(stringExtra) : null;
            }
            c09h.A05 = i;
            this.A03.A0C(this.A0F.A01(A0F, c09h, (byte) 13, 0, C002701i.A0t(this.A0H.A05.getStringText()), parse, null, this.A0H.A05.getMentions(), getIntent().getBooleanExtra("number_from_url", false)), A03);
            int i3 = c09h.A05;
            if (i3 != 0) {
                C36891lX c36891lX = new C36891lX();
                if (i3 == 1) {
                    i2 = 0;
                } else if (i3 != 2) {
                    throw new IllegalArgumentException(C000200d.A0D("Unexpected provider type ", i3));
                } else {
                    i2 = 1;
                }
                c36891lX.A00 = Integer.valueOf(i2);
                this.A0B.A0B(c36891lX, null, false);
            }
            AbstractList abstractList = (AbstractList) A0F;
            if (abstractList.size() > 1 || (abstractList.size() == 1 && C003101m.A0Z((Jid) abstractList.get(0)))) {
                A1L(A0F);
            }
            setResult(-1);
        } else {
            Intent intent = new Intent();
            intent.putExtra("file_path", this.A0L);
            if (this.A0L == null) {
                intent.putExtra("media_url", getIntent().getStringExtra("media_url"));
                intent.putExtra("media_width", getIntent().getIntExtra("media_width", -1));
                intent.putExtra("media_height", getIntent().getIntExtra("media_height", -1));
                intent.putExtra("preview_media_url", getIntent().getStringExtra("preview_media_url"));
            }
            intent.putExtra("provider", getIntent().getIntExtra("provider", 0));
            intent.putExtra("caption", C002701i.A0t(this.A0H.A05.getStringText()));
            intent.putStringArrayListExtra("mentions", C003101m.A0E(this.A0H.A05.getMentions()));
            intent.putExtra("clear_message_after_send", getIntent().getBooleanExtra("clear_message_after_send", false));
            setResult(-1, intent);
        }
        int intExtra = getIntent().getIntExtra("origin", 23);
        AbstractCollection abstractCollection = (AbstractCollection) A0F;
        boolean contains = abstractCollection.contains(C04580Kz.A00);
        int size = abstractCollection.size() - (contains ? 1 : 0);
        C0HA c0ha = this.A0A;
        if (c0ha != null) {
            C37231m5 c37231m5 = new C37231m5();
            c37231m5.A01 = 11;
            c37231m5.A00 = Integer.valueOf(intExtra);
            c37231m5.A0D = Long.valueOf(contains ? 1L : 0L);
            c37231m5.A02 = Long.valueOf(size);
            Long valueOf = Long.valueOf(1);
            c37231m5.A08 = valueOf;
            c37231m5.A09 = valueOf;
            Long valueOf2 = Long.valueOf(0);
            c37231m5.A03 = valueOf2;
            c37231m5.A05 = valueOf2;
            c37231m5.A04 = valueOf2;
            c37231m5.A06 = valueOf2;
            c37231m5.A0A = valueOf2;
            c37231m5.A0C = valueOf2;
            c0ha.A0B.A09(c37231m5, 1);
            AnonymousClass011.A01(c37231m5, "");
            finish();
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0094, code lost:
        if (r2 == 2) goto L48;
     */
    @Override // X.C0W2, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GifVideoPreviewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C3ZX c3zx = this.A0H;
        if (c3zx != null) {
            c3zx.A00.getViewTreeObserver().removeGlobalOnLayoutListener(c3zx.A01);
            c3zx.A05.A07();
            c3zx.A03.dismiss();
            this.A0H = null;
        }
        C455822q c455822q = this.A0D;
        AnonymousClass241 anonymousClass241 = c455822q.A00;
        if (anonymousClass241 != null) {
            anonymousClass241.A00();
            c455822q.A00 = null;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        if (TextUtils.isEmpty(this.A0L)) {
            return;
        }
        this.A0K.setVideoPath(this.A0L);
        this.A0K.start();
        this.A00.setVisibility(8);
        this.A01.setVisibility(8);
        this.A02.setVisibility(8);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A0K.A00();
    }
}
