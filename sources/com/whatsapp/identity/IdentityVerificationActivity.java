package com.whatsapp.identity;

import X.AbstractC012105x;
import X.AbstractC66913Cx;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass024;
import X.C002301c;
import X.C003401q;
import X.C011305p;
import X.C012005w;
import X.C017708g;
import X.C018508q;
import X.C018708s;
import X.C02740Cr;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C04630Le;
import X.C04g;
import X.C05W;
import X.C06C;
import X.C07X;
import X.C07Y;
import X.C0DJ;
import X.C0EE;
import X.C0FA;
import X.C0HS;
import X.C0IQ;
import X.C0L6;
import X.C0LX;
import X.C0SG;
import X.C0SI;
import X.C0U1;
import X.C1D5;
import X.C1D6;
import X.C1DD;
import X.C1DV;
import X.C20O;
import X.C20U;
import X.C24921Dj;
import X.C2AY;
import X.C40071rX;
import X.C41711uO;
import X.C42821wN;
import X.C44501zB;
import X.C66883Cu;
import X.C68573Kl;
import X.C68583Km;
import X.ExecutorC004702d;
import X.InterfaceC04210Jh;
import X.InterfaceC04220Ji;
import X.InterfaceC41531u4;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.QrImageView;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class IdentityVerificationActivity extends C20U implements InterfaceC04210Jh, InterfaceC41531u4, InterfaceC04220Ji {
    public int A00;
    public int A01;
    public MenuItem A02;
    public View A03;
    public Animation A04;
    public ImageView A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public C0SG A09;
    public C012005w A0A;
    public C04g A0B;
    public C02L A0C;
    public C05W A0D;
    public C018708s A0E;
    public C2AY A0F;
    public C02E A0G;
    public C02F A0H;
    public C0IQ A0I;
    public C0FA A0J;
    public C06C A0K;
    public C41711uO A0L;
    public C42821wN A0M;
    public C0EE A0N;
    public WaQrScannerView A0O;
    public C40071rX A0P;
    public C003401q A0Q;
    public C0L6 A0R;
    public boolean A0S;
    public final Map A0X = Collections.singletonMap(C1D5.CHARACTER_SET, "ISO-8859-1");
    public final Runnable A0W = new RunnableEBaseShape3S0100000_I0_3(this, 16);
    public final C44501zB A0T = new C20O(this);
    public final AbstractC66913Cx A0U = new C68573Kl(this);
    public final AbstractC66913Cx A0V = new C68583Km(this);

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        super.A10(i);
        if (i == 101) {
            A1S();
            this.A0S = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0056, code lost:
        if (X.AnonymousClass051.A02(r2, r3) == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x005d A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0065 A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006f A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0093 A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x009b A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00a5 A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c9 A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d1 A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00db A[Catch: 0JX -> 0x0109, TryCatch #0 {0JX -> 0x0109, blocks: (B:111:0x0002, B:113:0x0013, B:115:0x0018, B:117:0x001c, B:119:0x0022, B:121:0x0026, B:122:0x0028, B:124:0x002e, B:125:0x0030, B:127:0x0039, B:129:0x003d, B:130:0x003f, B:132:0x0045, B:133:0x0047, B:139:0x0059, B:141:0x005d, B:142:0x005f, B:144:0x0065, B:145:0x0067, B:147:0x006f, B:149:0x0073, B:150:0x0075, B:152:0x007b, B:153:0x007d, B:157:0x0087, B:160:0x008f, B:162:0x0093, B:163:0x0095, B:165:0x009b, B:166:0x009d, B:168:0x00a5, B:170:0x00a9, B:171:0x00ab, B:173:0x00b1, B:174:0x00b3, B:178:0x00bd, B:181:0x00c5, B:183:0x00c9, B:184:0x00cb, B:186:0x00d1, B:187:0x00d3, B:189:0x00db, B:191:0x00df, B:192:0x00e1, B:194:0x00e7, B:195:0x00e9, B:199:0x00f3, B:136:0x0051), top: B:214:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1P(byte[] r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A1P(byte[]):int");
    }

    public final void A1Q() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3Cv
            {
                IdentityVerificationActivity.this = this;
            }

            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IdentityVerificationActivity.this.A03.setVisibility(8);
            }
        });
        translateAnimation.setDuration(300L);
        this.A03.startAnimation(translateAnimation);
    }

    public final void A1R() {
        if (A1Z()) {
            return;
        }
        if (this.A0H.A02("android.permission.CAMERA") != 0) {
            startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_verify_identity_request).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_verify_identity).putExtra("permissions", new String[]{"android.permission.CAMERA"}), 1);
            return;
        }
        findViewById(R.id.overlay).setVisibility(0);
        this.A0O.setVisibility(0);
        this.A07.setVisibility(8);
        ((ActivityC02290Ap) this).A0A.A02.removeCallbacks(this.A0W);
    }

    public final void A1S() {
        String obj;
        String string;
        Point point;
        if (this.A0I == null) {
            A1X(false);
            this.A08.setText(getString(R.string.verify_identity_no_keys, this.A0E.A04(this.A0K)));
            return;
        }
        int i = this.A01;
        int i2 = this.A00;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.verify_identity_tip);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.A07 = new C02770Cu();
        String str = null;
        if (!this.A0N.A02() && i2 <= 0) {
            obj = this.A0P.A03("general", "28030015", null).toString();
        } else {
            obj = this.A0P.A03("general", "26000361", null).toString();
        }
        if (i > 0) {
            if (i2 > 0) {
                string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.verify_identity_tip_both_multiple_device, i2, this.A0E.A04(this.A0K), obj, Integer.valueOf(i2));
            } else {
                string = getString(R.string.verify_identity_tip_self_multiple_device, this.A0E.A04(this.A0K), obj);
            }
        } else if (i2 > 0) {
            string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.verify_identity_tip_contact_multiple_device, i2, this.A0E.A04(this.A0K), obj, Integer.valueOf(i2));
        } else {
            string = getString(R.string.verify_identity_tip, this.A0E.A04(this.A0K), obj);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(string));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new C02740Cr(this, ((ActivityC02290Ap) this).A0A, this.A0G, ((ActivityC02270An) this).A01, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A0G, textEmojiLabel));
        textEmojiLabel.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        QrImageView qrImageView = (QrImageView) findViewById(R.id.qr_code);
        try {
            C0SG A01 = C24921Dj.A01(new String(this.A0I.A01.A0B(), "ISO-8859-1"), C1DV.L, new EnumMap(C1D6.class));
            this.A09 = A01;
            qrImageView.setQrCode(A01);
        } catch (C1DD | UnsupportedEncodingException e) {
            Log.w("idverification/", e);
        }
        String A00 = this.A0I.A00.A00();
        StringBuilder sb = new StringBuilder();
        int length = A00.length();
        for (int i3 = 1; i3 <= length; i3++) {
            sb.append(A00.charAt(i3 - 1));
            if (i3 != length) {
                if (i3 % 20 == 0) {
                    if (str == null) {
                        str = sb.toString();
                    }
                    sb.append('\n');
                } else if (i3 % 5 == 0) {
                    sb.append("     ");
                } else {
                    sb.append(' ');
                }
            }
        }
        float textSize = this.A08.getTextSize();
        float measureText = this.A08.getPaint().measureText(str);
        getWindowManager().getDefaultDisplay().getSize(new Point());
        float min = Math.min(point.x, point.y) - getResources().getDimension(R.dimen.identity_verification_width_density);
        while (measureText > min && textSize > 1.0f) {
            textSize -= 1.0f;
            this.A08.setTextSize(textSize);
            measureText = this.A08.getPaint().measureText(str);
        }
        this.A08.setText(sb.toString());
        C0LX.A03(this.A08);
        A1X(true);
    }

    public final void A1T(Intent intent) {
        NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
        byte[] payload = ndefMessage.getRecords()[0].getPayload();
        UserJid nullable = UserJid.getNullable(new String(ndefMessage.getRecords()[0].getId(), Charset.forName("US-ASCII")));
        if (nullable == null) {
            return;
        }
        C06C A0A = this.A0D.A0A(nullable);
        this.A0K = A0A;
        String A04 = this.A0E.A04(A0A);
        A1A(getString(R.string.verify_identity_names, A04));
        A1W(false);
        if (this.A0I == null) {
            Log.w("idverification/ndef/no-fingerprint");
            return;
        }
        int A1P = A1P(payload);
        if (A1P == -3) {
            ((ActivityC02290Ap) this).A0A.A0E(getString(R.string.verify_identity_result_wrong_you, A04), 1);
        } else if (A1P != -2) {
            if (A1P != 1) {
                if (A1P == 2) {
                    A1Y(false);
                } else {
                    return;
                }
            }
            A1Y(true);
        } else {
            ((ActivityC02290Ap) this).A0A.A0E(getString(R.string.verify_identity_result_wrong_contact, A04), 1);
        }
    }

    public final void A1U(UserJid userJid) {
        C02L c02l = this.A0C;
        c02l.A05();
        if (userJid.equals(c02l.A03) || userJid.equals(this.A0K.A03(UserJid.class))) {
            runOnUiThread(new RunnableEBaseShape3S0100000_I0_3(this, 13));
        }
    }

    public final void A1V(final Runnable runnable) {
        if (A1Z()) {
            findViewById(R.id.main_layout).setVisibility(0);
            findViewById(R.id.scan_code).setVisibility(0);
            findViewById(R.id.verify_identity_qr_tip).setVisibility(8);
            findViewById(R.id.overlay).setVisibility(8);
            this.A07.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(getResources().getInteger(17694721));
            translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3Cw
                {
                    IdentityVerificationActivity.this = this;
                }

                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IdentityVerificationActivity.this.A0O.setVisibility(8);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            findViewById(R.id.main_layout).startAnimation(translateAnimation);
        }
    }

    public final void A1W(boolean z) {
        AbstractC66913Cx abstractC66913Cx;
        ARS();
        if (z) {
            abstractC66913Cx = this.A0V;
        } else {
            abstractC66913Cx = this.A0U;
        }
        C42821wN c42821wN = this.A0M;
        UserJid userJid = (UserJid) this.A0K.A03(UserJid.class);
        ExecutorC004702d executorC004702d = c42821wN.A04;
        synchronized (executorC004702d) {
            executorC004702d.A03.clear();
        }
        new C0HS(userJid, abstractC66913Cx) { // from class: X.3Cs
            public Set A00;
            public Set A01;
            public final UserJid A02;
            public final WeakReference A03;

            {
                this.A02 = userJid;
                this.A03 = new WeakReference(abstractC66913Cx);
            }

            @Override // X.C0HS
            public void A06() {
                AbstractC66913Cx abstractC66913Cx2 = (AbstractC66913Cx) this.A03.get();
                if (abstractC66913Cx2 != null) {
                    abstractC66913Cx2.A00.A06.setVisibility(0);
                }
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                UserJid userJid2 = this.A02;
                if (userJid2 != null) {
                    C42821wN c42821wN2 = C42821wN.this;
                    C0EC c0ec = c42821wN2.A03;
                    if (c0ec.A05.A04()) {
                        Set A07 = c0ec.A07(userJid2);
                        this.A01 = A07;
                        C43071wo c43071wo = c42821wN2.A02;
                        AbstractMap abstractMap = (AbstractMap) c43071wo.A01(A07);
                        if (abstractMap.isEmpty() || this.A01.size() != abstractMap.size()) {
                            return null;
                        }
                        HashSet A02 = c0ec.A02().A02();
                        this.A00 = A02;
                        Map A01 = c43071wo.A01(A02);
                        C02L c02l = c42821wN2.A00;
                        c02l.A05();
                        UserJid userJid3 = c02l.A03;
                        if (userJid3 != null) {
                            Collection<C0IP> values = ((AbstractMap) A01).values();
                            ArrayList arrayList = new ArrayList();
                            for (C0IP c0ip : values) {
                                arrayList.add(c0ip.A00);
                            }
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            C0IO A0T = C002701i.A0T(DeviceJid.of(userJid2));
                            C01J c01j = c42821wN2.A01;
                            String A0S = C40731sm.A0S(userJid3.user);
                            String A0S2 = C40731sm.A0S(A0T.A01);
                            Collection<C0IP> values2 = abstractMap.values();
                            ArrayList arrayList3 = new ArrayList();
                            for (C0IP c0ip2 : values2) {
                                arrayList3.add(c0ip2.A00);
                            }
                            return c01j.A09(A0S, arrayList2, A0S2, new ArrayList(arrayList3));
                        }
                        throw null;
                    }
                    return c42821wN2.A01(userJid2);
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                String str;
                String A08;
                C0IQ c0iq = (C0IQ) obj;
                AbstractC66913Cx abstractC66913Cx2 = (AbstractC66913Cx) this.A03.get();
                if (abstractC66913Cx2 != null) {
                    Set set = this.A00;
                    Set set2 = this.A01;
                    IdentityVerificationActivity identityVerificationActivity = abstractC66913Cx2.A00;
                    identityVerificationActivity.A06.setVisibility(8);
                    if (c0iq != null) {
                        C42821wN c42821wN2 = identityVerificationActivity.A0M;
                        C0IQ c0iq2 = identityVerificationActivity.A0I;
                        if (c42821wN2 == null) {
                            throw null;
                        }
                        if (c0iq2 != c0iq) {
                            if (c0iq2 != null && c0iq2.A00.equals(c0iq.A00)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    identityVerificationActivity.A0I = c0iq;
                    identityVerificationActivity.A01 = set == null ? 0 : set.size();
                    identityVerificationActivity.A00 = set2 != null ? set2.size() - 1 : 0;
                    if (identityVerificationActivity.A0S) {
                        return;
                    }
                    if (!(abstractC66913Cx2 instanceof C68583Km)) {
                        ((C68573Kl) abstractC66913Cx2).A00.A1S();
                        return;
                    }
                    IdentityVerificationActivity identityVerificationActivity2 = ((C68583Km) abstractC66913Cx2).A00;
                    C06C c06c = identityVerificationActivity2.A0K;
                    if (c06c != null && (A08 = identityVerificationActivity2.A0E.A08(c06c, false)) != null) {
                        str = ((ActivityC02310Ar) identityVerificationActivity2).A01.A0E(A08);
                    } else {
                        str = null;
                    }
                    String A03 = identityVerificationActivity2.A0Q.A03((AbstractC005302j) identityVerificationActivity2.A0K.A03(AbstractC005302j.class), R.string.security_code_changed_dialog_title, str);
                    C0U4 c0u4 = new C0U4(identityVerificationActivity2.A0Q.A03((AbstractC005302j) identityVerificationActivity2.A0K.A03(AbstractC005302j.class), R.string.security_code_changed_dialog_message, str));
                    c0u4.A08 = A03;
                    c0u4.A00 = 101;
                    identityVerificationActivity2.AUg(c0u4.A01(), null);
                    identityVerificationActivity2.A0S = true;
                }
            }
        }.A02.executeOnExecutor(executorC004702d, new Void[0]);
    }

    public final void A1X(boolean z) {
        MenuItem menuItem = this.A02;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        findViewById(R.id.footer).setVisibility(z ? 0 : 8);
        findViewById(R.id.verify_identity_tip).setVisibility(z ? 0 : 8);
        findViewById(R.id.qr_code_group).setVisibility(z ? 0 : 8);
    }

    public final void A1Y(boolean z) {
        this.A05.setVisibility(0);
        ImageView imageView = this.A05;
        int i = R.drawable.red_circle;
        if (z) {
            i = R.drawable.green_circle;
        }
        imageView.setBackgroundResource(i);
        ImageView imageView2 = this.A05;
        int i2 = R.string.identity_not_verified;
        if (z) {
            i2 = R.string.identity_verified;
        }
        imageView2.setContentDescription(getString(i2));
        ImageView imageView3 = this.A05;
        int i3 = R.drawable.ill_verification_failure;
        if (z) {
            i3 = R.drawable.ill_verification_success;
        }
        imageView3.setImageResource(i3);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setDuration(getResources().getInteger(17694721));
        this.A05.startAnimation(animationSet);
        this.A05.setFocusable(true);
        this.A05.setFocusableInTouchMode(true);
        this.A05.requestFocus();
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.postDelayed(this.A0W, 4000L);
    }

    public final boolean A1Z() {
        WaQrScannerView waQrScannerView = this.A0O;
        return waQrScannerView != null && waQrScannerView.getVisibility() == 0;
    }

    @Override // X.InterfaceC41531u4
    public void AHg(DeviceJid deviceJid) {
        if (AnonymousClass024.A0l(this.A0K.A03(UserJid.class), deviceJid == null ? null : deviceJid.userJid)) {
            A1W(false);
        }
    }

    @Override // X.InterfaceC04210Jh
    public void AKj(DeviceJid deviceJid, int i) {
        runOnUiThread(new RunnableEBaseShape2S0200000_I0_2(this, deviceJid, 29));
    }

    @Override // X.InterfaceC04210Jh
    public void AL0(DeviceJid deviceJid) {
        A1U(deviceJid.userJid);
    }

    @Override // X.InterfaceC04210Jh
    public void AL1(DeviceJid deviceJid) {
        A1U(deviceJid.userJid);
    }

    @Override // X.InterfaceC04210Jh
    public void AL2(DeviceJid deviceJid) {
        A1U(deviceJid.userJid);
    }

    @Override // X.InterfaceC04220Ji
    public void AQD(UserJid userJid, Set set, Set set2) {
        if (set.isEmpty() && set2.isEmpty()) {
            return;
        }
        A1U(userJid);
    }

    @Override // android.app.Activity
    public void finish() {
        if (A1Z() && findViewById(R.id.main_layout).getVisibility() == 8) {
            A1V(null);
        } else {
            super.finish();
        }
    }

    public void lambda$onCreate$1821$IdentityVerificationActivity(View view) {
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 14));
    }

    public /* synthetic */ void lambda$onCreate$1823$IdentityVerificationActivity(View view) {
        A1R();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A1R();
        }
    }

    @Override // X.C20U, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.verify_identity);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            try {
                C06C A0A = this.A0D.A0A(UserJid.get(getIntent().getStringExtra("jid")));
                this.A0K = A0A;
                A1A(getString(R.string.verify_identity_names, this.A0E.A04(A0A)));
                setContentView(R.layout.identity_verification);
                this.A08 = (TextView) findViewById(R.id.identity_text);
                this.A06 = (ProgressBar) findViewById(R.id.progress_bar);
                this.A07 = (TextView) findViewById(R.id.error_indicator);
                this.A0O = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
                this.A03 = findViewById(R.id.header);
                if (!((ActivityC02290Ap) this).A0F.A00.getBoolean("security_notifications", false) && ((ActivityC02290Ap) this).A0F.A0p(2592000000L, "security_notifications_alert_timestamp")) {
                    this.A03.postDelayed(new RunnableEBaseShape3S0100000_I0_3(this, 15), 1000L);
                }
                findViewById(R.id.enable).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 17));
                findViewById(R.id.close).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 38));
                WaQrScannerView waQrScannerView = this.A0O;
                waQrScannerView.setQrDecodeHints(this.A0X);
                waQrScannerView.setQrScannerCallback(new C66883Cu(this));
                A1X(false);
                A1W(false);
                View findViewById = findViewById(R.id.result);
                if (findViewById != null) {
                    this.A05 = (ImageView) findViewById;
                    View findViewById2 = findViewById(R.id.scan_code);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 16));
                        if (this.A0H.A02("android.permission.NFC") == 0) {
                            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
                            if (defaultAdapter != null) {
                                try {
                                    defaultAdapter.setNdefPushMessageCallback(new NfcAdapter.CreateNdefMessageCallback() { // from class: X.2wn
                                        {
                                            IdentityVerificationActivity.this = this;
                                        }

                                        @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
                                        public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
                                            IdentityVerificationActivity identityVerificationActivity = IdentityVerificationActivity.this;
                                            if (identityVerificationActivity.A0I == null) {
                                                Log.w("idverification/createndef/no-fingerprint");
                                                return null;
                                            }
                                            NdefRecord[] ndefRecordArr = new NdefRecord[2];
                                            byte[] bytes = "application/com.whatsapp.identity".getBytes(Charset.forName("US-ASCII"));
                                            C02L c02l = identityVerificationActivity.A0C;
                                            c02l.A05();
                                            UserJid userJid = c02l.A03;
                                            if (userJid != null) {
                                                ndefRecordArr[0] = new NdefRecord((short) 2, bytes, userJid.getRawString().getBytes(Charset.forName("US-ASCII")), identityVerificationActivity.A0I.A01.A0B());
                                                ndefRecordArr[1] = NdefRecord.createApplicationRecord("com.whatsapp");
                                                return new NdefMessage(ndefRecordArr);
                                            }
                                            throw null;
                                        }
                                    }, this, new Activity[0]);
                                } catch (IllegalStateException | SecurityException e) {
                                    Log.w("idverification/ ", e);
                                }
                            }
                            if ("android.nfc.action.NDEF_DISCOVERED".equals(getIntent().getAction())) {
                                A1T(getIntent());
                            }
                        }
                        this.A0F.A01(this);
                        this.A0B.A00(this);
                        this.A0J.A00(this);
                        this.A0L.A00(this.A0T);
                        return;
                    }
                    throw null;
                }
                throw null;
            } catch (C011305p e2) {
                Log.e("idverification/finishing due to invalid jid", e2);
                finish();
                return;
            }
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_share, 0, R.string.share).setIcon(R.drawable.ic_action_share);
        this.A02 = icon;
        icon.setShowAsAction(2);
        this.A02.setVisible(this.A0I != null);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00(this);
        this.A0B.A01(this);
        this.A0J.A01(this);
        this.A0L.A01(this.A0T);
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.removeCallbacks(this.A0W);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            A1T(intent);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        FileOutputStream fileOutputStream;
        byte b = 1;
        if (menuItem.getItemId() == R.id.menuitem_share) {
            if (A1Z()) {
                A1V(new RunnableEBaseShape3S0100000_I0_3(this, 17));
                return true;
            }
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            int min = (Math.min(point.x, point.y) << 1) / 3;
            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-1);
            C017708g c017708g = this.A09.A04;
            int i = c017708g.A01;
            int i2 = c017708g.A00;
            int i3 = min / 12;
            float f = (min - (i3 << 1)) * 1.0f;
            float f2 = f / i;
            float f3 = f / i2;
            Paint paint = new Paint();
            paint.setColor(-16777216);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = 0;
                while (i5 < i2) {
                    if (c017708g.A02[i5][i4] == b) {
                        float f4 = i3;
                        canvas.drawRect((i4 * f2) + f4, (i5 * f3) + f4, ((i4 + 1) * f2) + f4, ((i5 + 1) * f3) + f4, paint);
                    }
                    i5++;
                    b = 1;
                }
            }
            File A01 = AbstractC012105x.A01(this.A0A.A0B(), "code.png");
            try {
                try {
                    fileOutputStream = new FileOutputStream(A01);
                } catch (FileNotFoundException e) {
                    Log.e("idverification/sharefailed", e);
                    ((ActivityC02290Ap) this).A0A.A07(R.string.share_failed, 0);
                    createBitmap.recycle();
                    return true;
                } catch (IOException e2) {
                    Log.e(e2);
                }
                try {
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
                    fileOutputStream.close();
                    createBitmap.recycle();
                    String A00 = this.A0I.A00.A00();
                    StringBuilder sb = new StringBuilder();
                    int length = A00.length();
                    for (int i6 = 1; i6 <= length; i6++) {
                        sb.append(A00.charAt(i6 - 1));
                        if (i6 != length) {
                            if (i6 % 20 == 0) {
                                sb.append('\n');
                            } else if (i6 % 5 == 0) {
                                sb.append(" ");
                            }
                        }
                    }
                    Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
                    C02L c02l = this.A0C;
                    c02l.A05();
                    UserJid userJid = c02l.A03;
                    if (userJid != null) {
                        intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.identity_code_email_subject, ((ActivityC02310Ar) this).A01.A0E(this.A0C.A02()), ((ActivityC02310Ar) this).A01.A0F(C04630Le.A03(userJid.user))));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getString(R.string.identity_code_email_body));
                        sb2.append("\n");
                        C002301c c002301c = ((ActivityC02310Ar) this).A01;
                        String obj = sb.toString();
                        if (c002301c != null) {
                            String[] split = obj.split("\n");
                            C0SI c0si = c002301c.A02().A01;
                            int length2 = obj.length();
                            int length3 = split.length;
                            StringBuilder sb3 = new StringBuilder((length3 << 2) + length2);
                            for (int i7 = 0; i7 < length3; i7++) {
                                String str = split[i7];
                                C07X c07x = C07Y.A04;
                                if (c0si != null) {
                                    sb3.append(str == null ? null : c0si.A03(str, c07x).toString());
                                    sb3.append('\n');
                                } else {
                                    throw null;
                                }
                            }
                            sb2.append(sb3.toString());
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            intent.putExtra("android.intent.extra.STREAM", AnonymousClass024.A04(getApplicationContext(), A01));
                            intent.setType("image/png");
                            intent.addFlags(524288);
                            startActivity(Intent.createChooser(intent, null));
                            return true;
                        }
                        throw null;
                    }
                    throw null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                createBitmap.recycle();
                throw th3;
            }
        } else if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A0O.getVisibility() == 0) {
            this.A0O.setVisibility(4);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0O.getVisibility() == 4) {
            this.A0O.setVisibility(0);
        }
    }
}
