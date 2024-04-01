package com.whatsapp;

import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.AnonymousClass092;
import X.AnonymousClass223;
import X.AnonymousClass227;
import X.AnonymousClass228;
import X.C000200d;
import X.C002701i;
import X.C003701t;
import X.C012005w;
import X.C018608r;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02E;
import X.C02O;
import X.C04310Jr;
import X.C04580Kz;
import X.C05920Qu;
import X.C0EB;
import X.C0JJ;
import X.C0LX;
import X.C0W9;
import X.C0We;
import X.C26761Ko;
import X.C2AM;
import X.C2BP;
import X.C2CI;
import X.C2EO;
import X.C2MI;
import X.C2MQ;
import X.C31S;
import X.C35611jQ;
import X.C35641jT;
import X.C40081rY;
import X.C43981yK;
import X.C455822q;
import X.C47212Ai;
import X.C47682Ce;
import X.C48222Ej;
import X.C48342Ew;
import X.C48352Ex;
import X.C49302Jn;
import X.C61422w7;
import X.InterfaceC002901k;
import X.InterfaceC04790Lv;
import X.InterfaceC04830Lz;
import X.InterfaceC09180cm;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.FirstStatusConfirmationDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TextStatusComposerActivity extends C0W9 implements C2EO {
    public static final int[] A0e = {R.string.color_name_medium_red_violet, R.string.color_name_wasabi, R.string.color_name_sundance, R.string.color_name_scarlett, R.string.color_name_brandy_rose, R.string.color_name_bright_sun, R.string.color_name_earls_green, R.string.color_name_prelude, R.string.color_name_ce_soir, R.string.color_name_mona_lisa, R.string.color_name_emerald, R.string.color_name_bittersweet, R.string.color_name_summer_sky, R.string.color_name_maya_blue, R.string.color_name_scorpion, R.string.color_name_bali_hai, R.string.color_name_maya_blue_1, R.string.color_name_vivid_violet, R.string.color_name_monte_carlo, R.string.color_name_elephant, R.string.color_name_polo_blue};
    public static final int[] A0f = {R.string.font_name_sans_serif, R.string.font_name_serif, R.string.font_name_bryndan_write, R.string.font_name_norican, R.string.font_name_oswald};
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ImageButton A05;
    public ImageButton A06;
    public TextView A07;
    public C012005w A08;
    public C01B A09;
    public TextEmojiLabel A0A;
    public C018608r A0B;
    public C05920Qu A0C;
    public WebPagePreviewView A0D;
    public C02E A0E;
    public C0EB A0F;
    public C40081rY A0G;
    public C47682Ce A0H;
    public C2MI A0I;
    public C003701t A0J;
    public AnonymousClass011 A0K;
    public C48352Ex A0L;
    public C48342Ew A0M;
    public C455822q A0N;
    public C47212Ai A0O;
    public AnonymousClass228 A0P;
    public C2MQ A0Q;
    public C2BP A0R;
    public AnonymousClass227 A0S;
    public MentionableEntry A0T;
    public C02O A0U;
    public C2AM A0V;
    public InterfaceC002901k A0W;
    public Runnable A0X;
    public String A0Y;
    public String A0Z;
    public boolean A0a;
    public int A00 = C48222Ej.A00();
    public int A01 = 0;
    public final Handler A0b = new Handler(Looper.getMainLooper());
    public final InterfaceC09180cm A0c = new InterfaceC09180cm() { // from class: X.1jP
        {
            TextStatusComposerActivity.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            TextStatusComposerActivity.this.A0T.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            C002701i.A1H(TextStatusComposerActivity.this.A0T, iArr, 0);
        }
    };
    public final int[] A0d = new int[2];

    public static int A00(CharSequence charSequence, int i, int i2) {
        int A02 = C43981yK.A02(charSequence, i, i2);
        int i3 = 0;
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        while (i < i2) {
            if (charSequence.charAt(i) == '\n') {
                i3++;
            }
            i++;
        }
        return (i3 * 49) + A02;
    }

    public static void A01(TextStatusComposerActivity textStatusComposerActivity) {
        textStatusComposerActivity.AUm(((ActivityC02310Ar) textStatusComposerActivity).A01.A0A(R.plurals.status_update_exceeds_character_limit, 700L, 700));
    }

    public final void A1P() {
        if (this.A04.getVisibility() == 0) {
            this.A04.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 2.0f);
            translateAnimation.setDuration(160L);
            this.A04.startAnimation(translateAnimation);
        }
    }

    public final void A1Q() {
        int i = this.A00;
        int[] iArr = C48222Ej.A01;
        this.A00 = iArr[(C48222Ej.A01(iArr, i) + 1) % iArr.length];
        getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
    }

    public final void A1R() {
        String trim = this.A0T.getText().toString().trim();
        if (!AnonymousClass029.A1R(this.A0E, this.A0U, trim)) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.cannot_send_empty_text_message, 1);
        } else if (!this.A0F.A0H()) {
            AUh(new FirstStatusConfirmationDialogFragment());
        } else {
            this.A06.setEnabled(false);
            C02180Ae.A16(this.A06, true, false);
            C018608r c018608r = this.A0B;
            String A0t = C002701i.A0t(trim);
            int i = this.A00;
            int i2 = this.A01;
            C05920Qu c05920Qu = this.A0C;
            if (c018608r != null) {
                TextData textData = new TextData();
                textData.backgroundColor = i;
                textData.textColor = -1;
                textData.fontStyle = i2;
                C0JJ A04 = c018608r.A12.A04(C04580Kz.A00, C48222Ej.A03(A0t), c018608r.A0J.A05(), c05920Qu, null, null);
                c018608r.A0R(A04);
                A04.A1A(textData);
                ((AnonymousClass092) A04).A04 = 5;
                c018608r.A0U.A0Q(A04);
                c018608r.A15.A05(A04, 0L, 1);
                ((ActivityC02290Ap) this).A0A.A07(R.string.sending_status, 0);
                getWindow().setSoftInputMode(3);
                this.A0T.A01();
                finish();
                return;
            }
            throw null;
        }
    }

    public void A1S(C05920Qu c05920Qu) {
        if (c05920Qu != null) {
            if (TextUtils.equals(this.A0Z, c05920Qu.A0G)) {
                if (c05920Qu.A0C()) {
                    this.A0C = c05920Qu;
                    Log.i("textstatus/showlinkpreview");
                    if (this.A0D == null) {
                        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(this);
                        this.A0D = webPagePreviewView;
                        this.A04.addView(webPagePreviewView);
                        C0LX.A06(((ActivityC02310Ar) this).A01, this.A0D.findViewById(R.id.title), 0, getResources().getDimensionPixelSize(R.dimen.text_status_composer_title_padding));
                        this.A0D.setProgressBarVisibility(false);
                        View findViewById = this.A0D.findViewById(R.id.cancel);
                        findViewById.setVisibility(0);
                        findViewById.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1jR
                            {
                                TextStatusComposerActivity.this = this;
                            }

                            @Override // X.AbstractView$OnClickListenerC49532Ky
                            public void A00(View view) {
                                TextStatusComposerActivity textStatusComposerActivity = TextStatusComposerActivity.this;
                                textStatusComposerActivity.A0Y = textStatusComposerActivity.A0Z;
                                textStatusComposerActivity.A0C = null;
                                textStatusComposerActivity.A1P();
                            }
                        });
                        View findViewById2 = this.A0D.findViewById(R.id.thumb);
                        findViewById2.setOnClickListener(new C35641jT(this, findViewById2));
                    }
                    if (this.A04.getVisibility() != 0) {
                        this.A04.setVisibility(0);
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 2.0f, 1, 0.0f);
                        translateAnimation.setDuration(160L);
                        translateAnimation.setInterpolator(new DecelerateInterpolator());
                        this.A04.startAnimation(translateAnimation);
                    }
                    this.A0D.A01(c05920Qu, null);
                    return;
                }
                this.A0C = null;
                A1P();
                return;
            }
            return;
        }
        this.A0C = null;
        A1P();
    }

    public /* synthetic */ void A1T(C2CI c2ci) {
        this.A0c.AJi(c2ci.A00);
    }

    public void A1U(C49302Jn c49302Jn) {
        String trim = this.A0T.getText().toString().trim();
        ArrayList arrayList = new ArrayList();
        arrayList.add(C04580Kz.A00);
        C61422w7 c61422w7 = c49302Jn.A01;
        int i = c61422w7.A01;
        if (i <= 0) {
            i = c49302Jn.A02.A01;
        }
        int i2 = c61422w7.A00;
        if (i2 <= 0) {
            i2 = c49302Jn.A02.A00;
        }
        startActivityForResult(GifVideoPreviewActivity.A00(this, arrayList, c49302Jn.A02.A02, c61422w7.A02, c49302Jn.A03.A02, c49302Jn.A00, false, true, 22).putExtra("media_width", i).putExtra("media_height", i2).putExtra("caption", C002701i.A0t(trim)), 1);
    }

    public boolean A1V() {
        int i = this.A00;
        int[] iArr = C48222Ej.A01;
        int A01 = C48222Ej.A01(iArr, i);
        if (A01 <= 0) {
            A01 = iArr.length;
        }
        this.A00 = iArr[A01 - 1];
        getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
        AnonymousClass088.A1C(this, this.A0E, getString(A0e[C48222Ej.A01(iArr, this.A00)]));
        return true;
    }

    public boolean A1W() {
        int i = this.A01;
        int[] iArr = C48222Ej.A02;
        int A01 = C48222Ej.A01(iArr, i);
        if (A01 <= 0) {
            A01 = iArr.length;
        }
        int i2 = iArr[A01 - 1];
        this.A01 = i2;
        Typeface A02 = C48222Ej.A02(this, i2);
        this.A07.setTypeface(A02);
        this.A0T.setTypeface(A02);
        AnonymousClass088.A1C(this, this.A0E, getString(A0f[C48222Ej.A01(iArr, this.A01)]));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
        if ("video/x.looping_mp4".equals(r6) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1X(X.C26761Ko r11, androidx.core.view.inputmethod.InputContentInfoCompat r12, int r13) {
        /*
            r10 = this;
            X.1Kn r0 = r11.A00(r12, r13)
            r3 = 0
            if (r0 != 0) goto L8
            return r3
        L8:
            android.net.Uri r8 = r0.A00
            java.lang.String r6 = r0.A01
            r2 = 1
            if (r8 == 0) goto Lc1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r8)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r6)
            java.lang.String r5 = "video/x.looping_mp4"
            if (r0 != 0) goto L28
            boolean r0 = r5.equals(r6)
            r4 = 5
            if (r0 == 0) goto L2a
        L28:
            r4 = 23
        L2a:
            com.whatsapp.mentions.MentionableEntry r0 = r10.A0T
            java.lang.String r0 = r0.getStringText()
            java.lang.String r0 = X.C002701i.A0t(r0)
            X.1w2 r1 = new X.1w2
            r1.<init>(r8)
            r1.A0B(r0)
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L4b
            r0 = 13
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.A0A(r0)
        L4b:
            X.2Gx r5 = new X.2Gx
            r5.<init>(r1)
            X.0Kz r0 = X.C04580Kz.A00
            java.lang.String r1 = r0.getRawString()
            android.os.Bundle r9 = r5.A00()
            java.lang.Class<com.whatsapp.mediacomposer.MediaComposerActivity> r0 = com.whatsapp.mediacomposer.MediaComposerActivity.class
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r10, r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r6.putExtra(r0, r7)
            r7 = 0
            java.lang.String r0 = "android.intent.extra.TEXT"
            r6.putExtra(r0, r7)
            java.lang.String r0 = "jid"
            r6.putExtra(r0, r1)
            java.lang.String r0 = "jids"
            r6.putExtra(r0, r7)
            java.lang.String r0 = "max_items"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "origin"
            r6.putExtra(r0, r4)
            r4 = 0
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r8 = "picker_open_time"
            r6.putExtra(r8, r0)
            java.lang.String r0 = "send"
            r6.putExtra(r0, r2)
            java.lang.String r0 = "quoted_message_row_id"
            r6.putExtra(r0, r4)
            java.lang.String r0 = "quoted_group_jid"
            r6.putExtra(r0, r7)
            java.lang.String r0 = "number_from_url"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "media_preview_params"
            r6.putExtra(r0, r9)
            java.lang.String r0 = "smb_quick_reply"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "start_home"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "animate_uri"
            r6.putExtra(r0, r7)
            java.lang.String r0 = "preselected_image_uri"
            r6.putExtra(r0, r7)
            java.lang.String r0 = "scan_for_qr"
            r6.putExtra(r0, r3)
            r10.startActivityForResult(r6, r2)
            return r2
        Lc1:
            java.lang.String r0 = "textstatus/setuppreview/share-failed"
            com.whatsapp.util.Log.e(r0)
            X.08q r1 = r10.A0A
            r0 = 2131889821(0x7f120e9d, float:1.9414316E38)
            r1.A07(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextStatusComposerActivity.A1X(X.1Ko, androidx.core.view.inputmethod.InputContentInfoCompat, int):boolean");
    }

    @Override // X.C2EO
    public void AP2() {
        A1R();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0M.A01()) {
            View view = this.A03;
            int[] iArr = this.A0d;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= iArr[1]) {
                if (motionEvent.getRawY() < this.A03.getHeight() + iArr[1]) {
                    if (motionEvent.getAction() == 0) {
                        this.A0a = true;
                    } else if (motionEvent.getAction() == 1 && this.A0a) {
                        this.A0M.A00(true);
                        this.A0a = false;
                        return false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onCreate$2877$TextStatusComposerActivity(View view) {
        A1R();
    }

    public void lambda$onCreate$2878$TextStatusComposerActivity(View view) {
        A1Q();
        AnonymousClass088.A1C(this, this.A0E, getString(A0e[C48222Ej.A01(C48222Ej.A01, this.A00)]));
    }

    public void lambda$onCreate$2880$TextStatusComposerActivity(View view) {
        int i = this.A01;
        int[] iArr = C48222Ej.A02;
        int i2 = iArr[(C48222Ej.A01(iArr, i) + 1) % iArr.length];
        this.A01 = i2;
        Typeface A02 = C48222Ej.A02(this, i2);
        this.A07.setTypeface(A02);
        this.A0T.setTypeface(A02);
        AnonymousClass088.A1C(this, this.A0E, getString(A0f[C48222Ej.A01(iArr, this.A01)]));
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0M.A02()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.C0W9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(67108864, 67108864);
        }
        super.onCreate(bundle);
        setContentView(R.layout.text_status_composer);
        if (bundle == null) {
            A1Q();
        } else {
            this.A00 = bundle.getInt("background_color");
            getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
        }
        View findViewById = findViewById(R.id.send);
        if (findViewById != null) {
            ImageButton imageButton = (ImageButton) findViewById;
            this.A06 = imageButton;
            C02180Ae.A16(imageButton, false, false);
            this.A06.setImageDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.input_send)));
            this.A06.setOnClickListener(new View.OnClickListener() { // from class: X.1Iq
                {
                    TextStatusComposerActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextStatusComposerActivity.this.A1R();
                }
            });
            View findViewById2 = findViewById(R.id.color_picker_btn);
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: X.1Il
                {
                    TextStatusComposerActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextStatusComposerActivity.this.lambda$onCreate$2878$TextStatusComposerActivity(view);
                }
            });
            findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.1In
                {
                    TextStatusComposerActivity.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return TextStatusComposerActivity.this.A1V();
                }
            });
            TextView textView = (TextView) findViewById(R.id.font_picker_btn);
            this.A07 = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: X.1Io
                {
                    TextStatusComposerActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextStatusComposerActivity.this.lambda$onCreate$2880$TextStatusComposerActivity(view);
                }
            });
            this.A07.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.1Im
                {
                    TextStatusComposerActivity.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return TextStatusComposerActivity.this.A1W();
                }
            });
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.privacy_text);
            this.A0A = textEmojiLabel;
            if (this.A0F.A04() == 0) {
                string = getString(R.string.status_media_privacy_contacts);
            } else {
                string = getString(R.string.status_media_privacy_custom);
            }
            textEmojiLabel.setText(string);
            this.A04 = (ViewGroup) findViewById(R.id.web_page_preview_container);
            View findViewById3 = findViewById(R.id.entry);
            if (findViewById3 != null) {
                MentionableEntry mentionableEntry = (MentionableEntry) findViewById3;
                this.A0T = mentionableEntry;
                mentionableEntry.addTextChangedListener(new C35611jQ(this));
                this.A0T.setFilters(new InputFilter[]{new InputFilter() { // from class: X.1LG
                    {
                        TextStatusComposerActivity.this = this;
                    }

                    @Override // android.text.InputFilter
                    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                        int A00 = TextStatusComposerActivity.A00(spanned, 0, spanned.length());
                        int A002 = TextStatusComposerActivity.A00(spanned, i3, i4);
                        int A003 = TextStatusComposerActivity.A00(charSequence, i, i2);
                        int i5 = (700 - A00) + A002;
                        if (i5 <= 0) {
                            TextStatusComposerActivity.A01(TextStatusComposerActivity.this);
                            return "";
                        } else if (i5 >= A003) {
                            return null;
                        } else {
                            TextStatusComposerActivity.A01(TextStatusComposerActivity.this);
                            return C002701i.A0c(charSequence, i, i2, i5);
                        }
                    }
                }});
                String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
                if (stringExtra != null && TextUtils.getTrimmedLength(stringExtra) != 0) {
                    C02180Ae.A16(this.A06, true, true);
                    String A01 = C04310Jr.A01(stringExtra);
                    MentionableEntry mentionableEntry2 = this.A0T;
                    if (!TextUtils.isEmpty(A01)) {
                        stringExtra = C000200d.A0H(stringExtra, " ");
                    }
                    mentionableEntry2.setText(stringExtra);
                } else {
                    this.A06.setEnabled(false);
                    C02180Ae.A16(this.A06, false, false);
                }
                this.A0T.requestFocus();
                this.A0T.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.1Ik
                    {
                        TextStatusComposerActivity.this = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                        TextStatusComposerActivity textStatusComposerActivity = TextStatusComposerActivity.this;
                        if (i == 4) {
                            textStatusComposerActivity.A1R();
                            return true;
                        }
                        return false;
                    }
                });
                final C26761Ko c26761Ko = new C26761Ko();
                this.A0T.setOnCommitContentListener(new C31S() { // from class: X.1ha
                    {
                        TextStatusComposerActivity.this = this;
                    }

                    @Override // X.C31S
                    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle2) {
                        return TextStatusComposerActivity.this.A1X(c26761Ko, inputContentInfoCompat, i);
                    }
                });
                this.A03 = findViewById(R.id.controls);
                View findViewById4 = findViewById(R.id.emoji_picker_btn);
                if (findViewById4 != null) {
                    this.A05 = (ImageButton) findViewById4;
                    C48352Ex c48352Ex = new C48352Ex(this.A0J, this, this.A0N, ((ActivityC02270An) this).A0F, ((ActivityC02290Ap) this).A08, this.A0W, this.A0O, this.A0R, this.A0K, this.A0G, this.A09, this.A0S, ((ActivityC02290Ap) this).A0G, this.A0P, this.A0H, this.A0V, this.A0E, ((ActivityC02310Ar) this).A01, this.A0Q, this.A0I, ((ActivityC02290Ap) this).A0F, this.A0U, (KeyboardPopupLayout) findViewById(R.id.main), this.A05, this.A0T, null, null, null, null, null, null);
                    this.A0L = c48352Ex;
                    c48352Ex.A0A(this.A0c);
                    c48352Ex.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.1Ip
                        {
                            TextStatusComposerActivity.this = this;
                        }

                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            TextStatusComposerActivity.this.A05.setImageResource(R.drawable.ic_emoji_solid);
                        }
                    });
                    C48342Ew c48342Ew = new C48342Ew(this.A0N, ((ActivityC02270An) this).A0F, this.A0K, this.A09, this.A0E, this.A0Q, (GifSearchContainer) findViewById(R.id.gif_search_container), ((ActivityC02290Ap) this).A0F, (EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0L, this, this.A0G, this.A0H, ((ActivityC02310Ar) this).A01, this.A0U);
                    this.A0M = c48342Ew;
                    ((AnonymousClass223) c48342Ew).A00 = new InterfaceC04830Lz() { // from class: X.1hb
                        {
                            TextStatusComposerActivity.this = this;
                        }

                        @Override // X.InterfaceC04830Lz
                        public final void AJj(C2CI c2ci) {
                            TextStatusComposerActivity.this.A1T(c2ci);
                        }
                    };
                    c48342Ew.A00 = new InterfaceC04790Lv() { // from class: X.1hc
                        {
                            TextStatusComposerActivity.this = this;
                        }

                        @Override // X.InterfaceC04790Lv
                        public final void AKr(C49302Jn c49302Jn) {
                            TextStatusComposerActivity.this.A1U(c49302Jn);
                        }
                    };
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C48352Ex c48352Ex = this.A0L;
        if (c48352Ex != null) {
            c48352Ex.A0B();
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.isPrintingKey() && this.A0T.isShown() && !this.A0T.hasFocus()) {
            this.A0T.requestFocus();
            dispatchKeyEvent(keyEvent);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC02270An, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if ((i == 82 || i == 4) && this.A0L.isShowing()) {
            this.A0L.dismiss();
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("background_color", this.A00);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        getWindow().setSoftInputMode((this.A0L.isShowing() ? 2 : 4) | 1);
        if (this.A0L.isShowing()) {
            return;
        }
        this.A0T.A02(true);
    }
}
