package com.whatsapp.status.playback;

import X.AbstractActivityC50122Py;
import X.AbstractC005302j;
import X.AbstractC08940cM;
import X.AbstractC48182Ef;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass223;
import X.AnonymousClass227;
import X.AnonymousClass228;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C000700j;
import X.C002701i;
import X.C003101m;
import X.C003301p;
import X.C003701t;
import X.C008103m;
import X.C011005l;
import X.C012005w;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C03120Eg;
import X.C04300Jq;
import X.C05480Ox;
import X.C05U;
import X.C05W;
import X.C06570Tx;
import X.C06950Vu;
import X.C06960Vv;
import X.C06C;
import X.C08930cL;
import X.C0AT;
import X.C0C9;
import X.C0DV;
import X.C0DW;
import X.C0G2;
import X.C0GZ;
import X.C0HA;
import X.C0L5;
import X.C0L6;
import X.C0L9;
import X.C0LD;
import X.C0We;
import X.C0Zn;
import X.C26761Ko;
import X.C2AM;
import X.C2AS;
import X.C2BP;
import X.C2Bk;
import X.C2F8;
import X.C2JT;
import X.C2LR;
import X.C2LT;
import X.C2MI;
import X.C2MM;
import X.C2MQ;
import X.C2MV;
import X.C2MY;
import X.C31S;
import X.C40081rY;
import X.C40261rr;
import X.C41471ty;
import X.C41491u0;
import X.C41771uU;
import X.C41961un;
import X.C42391vf;
import X.C42401vg;
import X.C42471vn;
import X.C43791xz;
import X.C455822q;
import X.C461225a;
import X.C47212Ai;
import X.C47682Ce;
import X.C48342Ew;
import X.C48352Ex;
import X.C48362Ey;
import X.C49302Jn;
import X.C54562ix;
import X.C58312qw;
import X.C61422w7;
import X.C73453bf;
import X.C78373jo;
import X.C78833kb;
import X.C81933ph;
import X.C84143tG;
import X.InterfaceC002901k;
import X.InterfaceC04710Ln;
import X.InterfaceC04740Lq;
import X.InterfaceC04760Ls;
import X.InterfaceC04790Lv;
import X.InterfaceC04830Lz;
import X.InterfaceC05880Qp;
import X.InterfaceC09180cm;
import X.InterfaceC09830ep;
import X.InterfaceC48372Ez;
import X.InterfaceC53342en;
import X.InterfaceC58412r6;
import X.InterfaceC60692ut;
import X.InterfaceC73333bT;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.GifVideoPreviewActivity;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class MessageReplyActivity extends AbstractActivityC50122Py implements InterfaceC04710Ln, InterfaceC04740Lq, InterfaceC04760Ls {
    public View A00;
    public View A01;
    public View A02;
    public ImageButton A03;
    public ImageButton A04;
    public ImageButton A05;
    public ImageButton A06;
    public C012005w A07;
    public C02L A08;
    public C06950Vu A09;
    public C03010Du A0A;
    public C01B A0B;
    public C018608r A0C;
    public C0G2 A0D;
    public C06960Vv A0E;
    public C40261rr A0F;
    public C05W A0G;
    public C018708s A0H;
    public C0Zn A0I;
    public C0L5 A0J;
    public C54562ix A0K;
    public C03120Eg A0L;
    public C2MM A0M;
    public C000400f A0N;
    public C02E A0O;
    public AnonymousClass012 A0P;
    public C02F A0Q;
    public C000500h A0R;
    public C0C9 A0S;
    public C40081rY A0T;
    public C47682Ce A0U;
    public C2MI A0V;
    public C0L9 A0W;
    public C003701t A0X;
    public C0HA A0Y;
    public AnonymousClass011 A0Z;
    public C48352Ex A0a;
    public C48342Ew A0b;
    public C455822q A0c;
    public C47212Ai A0d;
    public AnonymousClass228 A0e;
    public C2MQ A0f;
    public C2BP A0g;
    public AnonymousClass227 A0h;
    public AbstractC005302j A0i;
    public C41471ty A0j;
    public C41491u0 A0k;
    public C41771uU A0l;
    public MentionableEntry A0m;
    public C0GZ A0n;
    public C2MY A0o;
    public C0DW A0p;
    public C0DV A0q;
    public C78373jo A0r;
    public C2F8 A0s;
    public C78833kb A0t;
    public C02O A0u;
    public AnonymousClass092 A0v;
    public C05U A0w;
    public C008103m A0x;
    public C2AM A0y;
    public C43791xz A0z;
    public C2Bk A10;
    public C2AS A11;
    public C461225a A12;
    public C42391vf A13;
    public C41961un A14;
    public C42471vn A15;
    public InterfaceC002901k A16;
    public C84143tG A17;
    public C2MV A18;
    public C42401vg A19;
    public C73453bf A1A;
    public C05480Ox A1B;
    public C0L6 A1C;
    public boolean A1E;
    public static final HashMap A1M = new HashMap();
    public static final HashMap A1L = new HashMap();
    public final Set A1I = new HashSet();
    public final Set A1H = new HashSet();
    public final Set A1J = new HashSet();
    public final InterfaceC05880Qp A1G = new InterfaceC05880Qp() { // from class: X.3pf
        {
            MessageReplyActivity.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
            boolean A01 = C000400f.A01();
            int i = R.string.record_need_sd_card_title_shared_storage;
            if (A01) {
                i = R.string.record_need_sd_card_title;
            }
            boolean A012 = C000400f.A01();
            int i2 = R.string.record_need_sd_card_message_shared_storage;
            if (A012) {
                i2 = R.string.record_need_sd_card_message;
            }
            messageReplyActivity.AUl(i, i2, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            MessageReplyActivity.this.AUl(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
            boolean A01 = C000400f.A01();
            int i = R.string.record_need_sd_card_title_shared_storage;
            if (A01) {
                i = R.string.record_need_sd_card_title;
            }
            boolean A012 = C000400f.A01();
            int i2 = R.string.record_need_sd_card_message_shared_storage;
            if (A012) {
                i2 = R.string.record_need_sd_card_message;
            }
            messageReplyActivity.AUl(i, i2, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            MessageReplyActivity.this.AUl(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
        }
    };
    public final InterfaceC09180cm A1F = new InterfaceC09180cm() { // from class: X.3pg
        {
            MessageReplyActivity.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            MessageReplyActivity.this.A0m.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
            if (messageReplyActivity.A1A.A0S()) {
                return;
            }
            C002701i.A1H(messageReplyActivity.A0m, iArr, 0);
        }
    };
    public boolean A1D = false;
    public final int[] A1K = new int[2];

    @Override // X.InterfaceC04710Ln
    public void A5a() {
    }

    @Override // X.InterfaceC04710Ln
    public void ARk() {
    }

    public void A1P() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            statusReplyActivity.A00.A04(statusReplyActivity.A0v, 2);
        }
    }

    public final void A1Q() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            statusReplyActivity.A00.A04(statusReplyActivity.A0v, 1);
        }
        ((ActivityC02290Ap) this).A0A.A07(R.string.sending_reply, 0);
        A1M.remove(this.A0v.A0n);
        A1L.remove(this.A0v.A0n);
        finish();
    }

    public final void A1R() {
        A1M.put(this.A0v.A0n, C002701i.A0t(this.A0m.getStringText()));
        A1L.put(this.A0v.A0n, AnonymousClass029.A0v(this.A0m.getMentions()));
    }

    public void A1S(C49302Jn c49302Jn) {
        if (this.A0F.A0H(UserJid.of(this.A0i))) {
            C002701i.A19(this, 106);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC005302j abstractC005302j = this.A0i;
        arrayList.add(abstractC005302j);
        C61422w7 c61422w7 = c49302Jn.A01;
        int i = c61422w7.A01;
        if (i <= 0) {
            i = c49302Jn.A02.A01;
        }
        int i2 = c61422w7.A00;
        if (i2 <= 0) {
            i2 = c49302Jn.A02.A00;
        }
        startActivityForResult(GifVideoPreviewActivity.A00(this, arrayList, c49302Jn.A02.A02, c61422w7.A02, c49302Jn.A03.A02, c49302Jn.A00, false, false, C003101m.A0Z(abstractC005302j) ? 24 : 22).putExtra("jid", this.A0i.getRawString()).putExtra("media_width", i).putExtra("media_height", i2).putExtra("mentions", C003101m.A0E(this.A0m.getMentions())).putExtra("caption", C002701i.A0t(this.A0m.getStringText())), 25);
    }

    public final void A1T(boolean z) {
        if (this.A0F.A0H(UserJid.of(this.A0i))) {
            C002701i.A19(this, 106);
            return;
        }
        C73453bf c73453bf = this.A1A;
        if (c73453bf != null) {
            if (c73453bf.A0S()) {
                c73453bf.A0P(true, false, true);
                A1Q();
                return;
            }
            File file = c73453bf.A0e;
            if (file != null) {
                if (file != null) {
                    c73453bf.A0H(file, false);
                    c73453bf.A0e = null;
                }
                this.A1A.A0J(true);
                A1Q();
                return;
            }
        }
        this.A05.setEnabled(false);
        String trim = this.A0m.getStringText().trim();
        if (!AnonymousClass029.A1R(this.A0O, this.A0u, trim)) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.cannot_send_empty_text_message, 1);
            return;
        }
        if (z) {
            trim = AnonymousClass024.A0K(trim, 65536);
        } else if (trim.codePointCount(0, trim.length()) > 65536) {
            C002701i.A19(this, 17);
            return;
        }
        this.A0C.A0d(Collections.singletonList(this.A0i), C002701i.A0t(trim), null, this.A0v, this.A0m.getMentions(), false, false);
        A1Q();
    }

    @Override // X.InterfaceC04710Ln
    public void A5b() {
        A1Q();
    }

    @Override // X.InterfaceC04710Ln
    public AnonymousClass092 ACf() {
        return this.A0v;
    }

    @Override // X.InterfaceC04740Lq
    public void AMy(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C78833kb c78833kb = this.A0t;
        c78833kb.A07 = true;
        c78833kb.A03 = pickerSearchDialogFragment;
        pickerSearchDialogFragment.A00 = c78833kb;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            c78833kb.A08.A01 = c78833kb;
        }
    }

    @Override // X.InterfaceC04760Ls
    public void ANh() {
        this.A0K.A01();
    }

    @Override // X.InterfaceC04760Ls
    public void APZ() {
        this.A0K.A00();
    }

    @Override // X.InterfaceC04740Lq
    public void AUf(DialogFragment dialogFragment) {
        AUh(dialogFragment);
        getWindow().setSoftInputMode(1);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0b.A01()) {
            View view = this.A00;
            int[] iArr = this.A1K;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= iArr[1]) {
                if (motionEvent.getRawY() < this.A00.getHeight() + iArr[1]) {
                    if (motionEvent.getAction() == 0) {
                        this.A1E = true;
                    } else if (motionEvent.getAction() == 1) {
                        if (this.A1E) {
                            this.A0b.A00(true);
                            this.A00.requestFocus();
                        }
                        this.A1E = false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onCreate$2439$MessageReplyActivity(View view) {
        this.A0K.A08(this.A1D ? 5 : 2);
    }

    public /* synthetic */ void lambda$onCreate$2445$MessageReplyActivity(View view) {
        A1T(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0088, code lost:
        if (r4 == 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x008a, code lost:
        r1 = 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x008c, code lost:
        if (r4 != 2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x008e, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x008f, code lost:
        r7.A05 = r0;
        r15.A0C.A0Y(r15.A0k.A09(r15.A0i, r7, (byte) 13, 0, r18.getStringExtra("caption"), r11, r15.A0v, X.C003101m.A0F(com.whatsapp.jid.UserJid.class, r18.getStringArrayListExtra("mentions")), false), r3);
        r15.A0b.A00(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ba, code lost:
        A1Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e6, code lost:
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x007e, code lost:
        if (r7.A0F != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0080, code lost:
        r4 = r18.getIntExtra("provider", 0);
        r1 = 1;
     */
    @Override // X.ActivityC02330At, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r16, int r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.AbstractActivityC50122Py, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C461225a c461225a = new C461225a(this.A11, this.A16, this.A0y, this.A10, this.A0R);
        this.A12 = c461225a;
        this.A0t = new C78833kb(c461225a);
        this.A0r = (C78373jo) new C06570Tx(this).A00(C78373jo.class);
        setContentView(R.layout.message_reply);
        AnonymousClass094 A02 = C0LD.A02(getIntent());
        AnonymousClass092 A0F = this.A0S.A0F(A02);
        this.A0v = A0F;
        if (A0F != null && !(A0F instanceof C04300Jq)) {
            AbstractC005302j abstractC005302j = A0F.A0n.A00;
            boolean A0Z = C003101m.A0Z(abstractC005302j);
            this.A1D = A0Z;
            if (A0Z) {
                abstractC005302j = A0F.A0A();
                if (abstractC005302j == null) {
                    throw null;
                }
            } else {
                C000700j.A04(abstractC005302j, "chatJid must not be null");
            }
            this.A0i = abstractC005302j;
            View findViewById = findViewById(R.id.main);
            if (findViewById != null) {
                this.A02 = findViewById;
                View findViewById2 = findViewById(R.id.bottom_sheet);
                if (findViewById2 != null) {
                    View findViewById3 = findViewById(R.id.conversation_entry_holder);
                    if (findViewById3 != null) {
                        this.A01 = findViewById3;
                        this.A00 = findViewById(R.id.edit_layout);
                        View findViewById4 = findViewById(R.id.send);
                        if (findViewById4 != null) {
                            this.A05 = (ImageButton) findViewById4;
                            View findViewById5 = findViewById(R.id.voice_note_btn);
                            if (findViewById5 != null) {
                                ImageButton imageButton = (ImageButton) findViewById5;
                                this.A06 = imageButton;
                                imageButton.setLongClickable(true);
                                this.A06.setOnTouchListener(new View.OnTouchListener() { // from class: X.3XE
                                    {
                                        MessageReplyActivity.this = this;
                                    }

                                    @Override // android.view.View.OnTouchListener
                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                        MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                        if (!messageReplyActivity.A0b.A01()) {
                                            messageReplyActivity.A1A.A0T(messageReplyActivity.A06, motionEvent, false);
                                        }
                                        return false;
                                    }
                                });
                                View findViewById6 = findViewById(R.id.camera_btn);
                                if (findViewById6 != null) {
                                    ImageButton imageButton2 = (ImageButton) findViewById6;
                                    this.A03 = imageButton2;
                                    imageButton2.setVisibility(0);
                                    this.A03.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 24));
                                    View findViewById7 = findViewById(R.id.input_attach_button);
                                    if (findViewById7 != null) {
                                        ImageButton imageButton3 = (ImageButton) findViewById7;
                                        this.A04 = imageButton3;
                                        imageButton3.setVisibility(0);
                                        this.A04.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 41));
                                        getLayoutInflater().inflate(R.layout.voice_note_view, (ViewGroup) findViewById(R.id.voice_note_stub), true);
                                        C81933ph c81933ph = new C81933ph(this, this, this, this.A02, this.A0P, this.A0X, ((ActivityC02290Ap) this).A0A, this.A16, this.A07, this.A0Z, this.A13, this.A0B, this.A0C, this.A0k, this.A1B, this.A1C, this.A0O, ((ActivityC02310Ar) this).A01, this.A0w, this.A0F, this.A0Y, this.A0N, this.A15, this.A0W, this.A19, this.A0R, this.A0D, this.A18, this.A0l, this.A0u, this.A0x, this.A0L, Build.VERSION.SDK_INT != 26);
                                        this.A1A = c81933ph;
                                        c81933ph.A0G(this.A0i);
                                        c81933ph.A0X = this.A0v;
                                        View findViewById8 = findViewById(R.id.entry);
                                        if (findViewById8 != null) {
                                            MentionableEntry mentionableEntry = (MentionableEntry) findViewById8;
                                            this.A0m = mentionableEntry;
                                            mentionableEntry.setFilters(new InputFilter[]{new InputFilter() { // from class: X.3XB
                                                {
                                                    MessageReplyActivity.this = this;
                                                }

                                                @Override // android.text.InputFilter
                                                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                                                    if (MessageReplyActivity.this.A1A.A0S()) {
                                                        return "";
                                                    }
                                                    return null;
                                                }
                                            }});
                                            final C26761Ko c26761Ko = new C26761Ko();
                                            this.A0m.A0E = new C31S() { // from class: X.3pW
                                                {
                                                    MessageReplyActivity.this = this;
                                                }

                                                /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
                                                    if (X.C003101m.A0Z(r6.A0i) == false) goto L9;
                                                 */
                                                @Override // X.C31S
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                */
                                                public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r8, int r9, android.os.Bundle r10) {
                                                    /*
                                                        r7 = this;
                                                        com.whatsapp.status.playback.MessageReplyActivity r6 = com.whatsapp.status.playback.MessageReplyActivity.this
                                                        X.1Ko r0 = r2
                                                        X.1Kn r5 = r0.A00(r8, r9)
                                                        if (r5 != 0) goto Lc
                                                        r0 = 0
                                                        return r0
                                                    Lc:
                                                        r4 = 0
                                                        java.lang.String r3 = r5.A01
                                                        java.lang.String r0 = "image/gif"
                                                        boolean r0 = r3.equals(r0)
                                                        java.lang.String r1 = "video/x.looping_mp4"
                                                        if (r0 != 0) goto L1f
                                                        boolean r0 = r3.equals(r1)
                                                        if (r0 == 0) goto L29
                                                    L1f:
                                                        X.02j r0 = r6.A0i
                                                        boolean r0 = X.C003101m.A0Z(r0)
                                                        r2 = 25
                                                        if (r0 != 0) goto L2a
                                                    L29:
                                                        r2 = 5
                                                    L2a:
                                                        boolean r0 = r3.equals(r1)
                                                        if (r0 == 0) goto L36
                                                        r0 = 13
                                                        java.lang.Byte r4 = java.lang.Byte.valueOf(r0)
                                                    L36:
                                                        X.2ix r1 = r6.A0K
                                                        android.net.Uri r0 = r5.A00
                                                        r1.A09(r0, r4, r2)
                                                        r0 = 1
                                                        return r0
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.C81823pW.onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat, int, android.os.Bundle):boolean");
                                                }
                                            };
                                            final View findViewById9 = findViewById(R.id.input_layout);
                                            findViewById9.setBackgroundResource(R.drawable.ib_new_expanded);
                                            findViewById9.setPadding(0, 0, 0, 0);
                                            if (C003101m.A0U(this.A0i)) {
                                                MentionableEntry mentionableEntry2 = this.A0m;
                                                mentionableEntry2.A05 = findViewById9;
                                                mentionableEntry2.A0B = new C2LT() { // from class: X.3pX
                                                    @Override // X.C2LT
                                                    public final void AII(boolean z) {
                                                        View view = findViewById9;
                                                        int i = R.drawable.ib_new_expanded;
                                                        if (z) {
                                                            i = R.drawable.ib_new_expanded_bottom;
                                                        }
                                                        view.setBackgroundResource(i);
                                                    }
                                                };
                                                mentionableEntry2.A0C((ViewGroup) findViewById(R.id.mention_attach), C011005l.A03(this.A0i), false, false, true);
                                            }
                                            String str = (String) A1M.get(this.A0v.A0n);
                                            if (!TextUtils.isEmpty(str)) {
                                                this.A0m.setMentionableText(str, AnonymousClass029.A0y((String) A1L.get(this.A0v.A0n)));
                                                AnonymousClass029.A17(this, this.A0T, this.A0O, this.A0u, this.A0m.getEditableText(), this.A0m.getPaint());
                                            }
                                            if (AnonymousClass024.A0j(str)) {
                                                this.A06.setVisibility(0);
                                                this.A03.setVisibility(0);
                                                this.A05.setVisibility(8);
                                            } else {
                                                this.A06.setVisibility(8);
                                                this.A03.setVisibility(8);
                                                this.A05.setVisibility(0);
                                            }
                                            this.A05.setImageDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.input_send)));
                                            View findViewById10 = findViewById(R.id.text_entry_layout);
                                            if (findViewById10 != null) {
                                                int max = Math.max(findViewById10.getPaddingLeft(), findViewById10.getPaddingRight());
                                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById10.getLayoutParams();
                                                if (((ActivityC02310Ar) this).A01.A0M()) {
                                                    layoutParams.rightMargin = max;
                                                } else {
                                                    layoutParams.leftMargin = max;
                                                }
                                                findViewById10.setLayoutParams(layoutParams);
                                                final C06C A0A = this.A0G.A0A(this.A0i);
                                                this.A0m.addTextChangedListener(new C2JT() { // from class: X.3pi
                                                    {
                                                        MessageReplyActivity.this = this;
                                                    }

                                                    @Override // X.C2JT, android.text.TextWatcher
                                                    public void afterTextChanged(Editable editable) {
                                                        MessageReplyActivity messageReplyActivity;
                                                        String obj = editable.toString();
                                                        if (!TextUtils.isEmpty(obj)) {
                                                            messageReplyActivity = MessageReplyActivity.this;
                                                            messageReplyActivity.A0C.A0I((AbstractC005302j) A0A.A03(AbstractC005302j.class), 0);
                                                        } else {
                                                            messageReplyActivity = MessageReplyActivity.this;
                                                            messageReplyActivity.A0C.A0G((AbstractC005302j) A0A.A03(AbstractC005302j.class));
                                                        }
                                                        AnonymousClass029.A17(messageReplyActivity, messageReplyActivity.A0T, messageReplyActivity.A0O, messageReplyActivity.A0u, editable, messageReplyActivity.A0m.getPaint());
                                                        boolean z = TextUtils.getTrimmedLength(obj) > 0;
                                                        messageReplyActivity.A05.setEnabled(z);
                                                        if (messageReplyActivity.A06.getVisibility() == 8 && !z) {
                                                            messageReplyActivity.A06.startAnimation(C73453bf.A00(true));
                                                            messageReplyActivity.A06.setVisibility(0);
                                                            messageReplyActivity.A04.startAnimation(Conversation.A0G(((ActivityC02310Ar) messageReplyActivity).A01.A0M(), true, false));
                                                            messageReplyActivity.A03.startAnimation(Conversation.A0F(((ActivityC02310Ar) messageReplyActivity).A01.A0M(), true));
                                                            messageReplyActivity.A03.setVisibility(0);
                                                            messageReplyActivity.A05.startAnimation(C73453bf.A00(false));
                                                            messageReplyActivity.A05.setVisibility(8);
                                                        } else if (messageReplyActivity.A06.getVisibility() != 0 || !z) {
                                                        } else {
                                                            messageReplyActivity.A06.startAnimation(C73453bf.A00(false));
                                                            messageReplyActivity.A06.setVisibility(8);
                                                            messageReplyActivity.A04.startAnimation(Conversation.A0G(((ActivityC02310Ar) messageReplyActivity).A01.A0M(), false, false));
                                                            messageReplyActivity.A03.startAnimation(Conversation.A0F(((ActivityC02310Ar) messageReplyActivity).A01.A0M(), false));
                                                            messageReplyActivity.A03.setVisibility(8);
                                                            messageReplyActivity.A05.startAnimation(C73453bf.A00(true));
                                                            messageReplyActivity.A05.setVisibility(0);
                                                        }
                                                    }
                                                });
                                                MentionableEntry mentionableEntry3 = this.A0m;
                                                ((C2LR) mentionableEntry3).A00 = new InterfaceC58412r6() { // from class: X.3pV
                                                    {
                                                        MessageReplyActivity.this = this;
                                                    }

                                                    @Override // X.InterfaceC58412r6
                                                    public final boolean ALE(int i, KeyEvent keyEvent) {
                                                        MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                        if (i == 4 && keyEvent.getAction() == 1) {
                                                            messageReplyActivity.A1P();
                                                            messageReplyActivity.A1R();
                                                            messageReplyActivity.finish();
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                };
                                                mentionableEntry3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3X9
                                                    {
                                                        MessageReplyActivity.this = this;
                                                    }

                                                    @Override // android.widget.TextView.OnEditorActionListener
                                                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                                                        MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                        if (i == 4) {
                                                            messageReplyActivity.A1T(false);
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                });
                                                this.A05.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 23));
                                                View findViewById11 = findViewById(R.id.emoji_picker_btn);
                                                if (findViewById11 != null) {
                                                    C48352Ex c48352Ex = new C48352Ex(this.A0X, this, this.A0c, ((ActivityC02270An) this).A0F, ((ActivityC02290Ap) this).A08, this.A16, this.A0d, this.A0g, this.A0Z, this.A0T, this.A0B, this.A0h, ((ActivityC02290Ap) this).A0G, this.A0e, this.A0U, this.A0y, this.A0O, ((ActivityC02310Ar) this).A01, this.A0f, this.A0V, ((ActivityC02290Ap) this).A0F, this.A0u, (KeyboardPopupLayout) findViewById(R.id.main_ccl), (ImageButton) findViewById11, this.A0m, this.A10, this.A11, this.A0z, this.A12, null, null);
                                                    this.A0a = c48352Ex;
                                                    C78833kb c78833kb = this.A0t;
                                                    c78833kb.A02 = this;
                                                    c78833kb.A00 = c48352Ex;
                                                    c48352Ex.A0J = c78833kb;
                                                    c48352Ex.A0A(this.A1F);
                                                    ((C48362Ey) c48352Ex).A09 = new InterfaceC60692ut() { // from class: X.3pZ
                                                        {
                                                            MessageReplyActivity.this = this;
                                                        }

                                                        @Override // X.InterfaceC60692ut
                                                        public final boolean AFL() {
                                                            C73453bf c73453bf = MessageReplyActivity.this.A1A;
                                                            return c73453bf == null || !c73453bf.A0S();
                                                        }
                                                    };
                                                    C48342Ew c48342Ew = new C48342Ew(this.A0c, ((ActivityC02270An) this).A0F, this.A0Z, this.A0B, this.A0O, this.A0f, (GifSearchContainer) findViewById(R.id.gif_search_container), ((ActivityC02290Ap) this).A0F, (EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0a, this, this.A0T, this.A0U, ((ActivityC02310Ar) this).A01, this.A0u);
                                                    this.A0b = c48342Ew;
                                                    ((AnonymousClass223) c48342Ew).A00 = new InterfaceC04830Lz() { // from class: X.3pY
                                                        {
                                                            MessageReplyActivity.this = this;
                                                        }

                                                        @Override // X.InterfaceC04830Lz
                                                        public final void AJj(C2CI c2ci) {
                                                            MessageReplyActivity.this.A1F.AJi(c2ci.A00);
                                                        }
                                                    };
                                                    c48342Ew.A00 = new InterfaceC04790Lv() { // from class: X.3pe
                                                        {
                                                            MessageReplyActivity.this = this;
                                                        }

                                                        @Override // X.InterfaceC04790Lv
                                                        public final void AKr(C49302Jn c49302Jn) {
                                                            MessageReplyActivity.this.A1S(c49302Jn);
                                                        }
                                                    };
                                                    this.A0a.A0L = new InterfaceC53342en() { // from class: X.3pT
                                                        {
                                                            MessageReplyActivity.this = this;
                                                        }

                                                        @Override // X.InterfaceC53342en
                                                        public final void AP7(C0JM c0jm, Integer num) {
                                                            MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                            if (messageReplyActivity.A0F.A0H(UserJid.of(messageReplyActivity.A0i))) {
                                                                C002701i.A19(messageReplyActivity, 106);
                                                                return;
                                                            }
                                                            C018608r c018608r = messageReplyActivity.A0C;
                                                            AbstractC005302j abstractC005302j2 = messageReplyActivity.A0i;
                                                            if (abstractC005302j2 != null) {
                                                                c018608r.A0Z(c0jm, abstractC005302j2, messageReplyActivity.A0v, false, num);
                                                                messageReplyActivity.A1Q();
                                                                return;
                                                            }
                                                            throw null;
                                                        }
                                                    };
                                                    C78833kb c78833kb2 = this.A0t;
                                                    c78833kb2.A01 = new InterfaceC48372Ez() { // from class: X.3pd
                                                        {
                                                            MessageReplyActivity.this = this;
                                                        }

                                                        @Override // X.InterfaceC48372Ez
                                                        public final void AKr(C49302Jn c49302Jn) {
                                                            MessageReplyActivity.this.A1S(c49302Jn);
                                                        }
                                                    };
                                                    c78833kb2.A04 = new InterfaceC53342en() { // from class: X.3pT
                                                        {
                                                            MessageReplyActivity.this = this;
                                                        }

                                                        @Override // X.InterfaceC53342en
                                                        public final void AP7(C0JM c0jm, Integer num) {
                                                            MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                            if (messageReplyActivity.A0F.A0H(UserJid.of(messageReplyActivity.A0i))) {
                                                                C002701i.A19(messageReplyActivity, 106);
                                                                return;
                                                            }
                                                            C018608r c018608r = messageReplyActivity.A0C;
                                                            AbstractC005302j abstractC005302j2 = messageReplyActivity.A0i;
                                                            if (abstractC005302j2 != null) {
                                                                c018608r.A0Z(c0jm, abstractC005302j2, messageReplyActivity.A0v, false, num);
                                                                messageReplyActivity.A1Q();
                                                                return;
                                                            }
                                                            throw null;
                                                        }
                                                    };
                                                    C461225a c461225a2 = this.A12;
                                                    c461225a2.A0A.A01(c461225a2.A09);
                                                    View inflate = getLayoutInflater().inflate(R.layout.quoted_message, (ViewGroup) null, false);
                                                    ((FrameLayout) inflate.findViewById(R.id.quoted_message_frame)).setForeground(C02180Ae.A0L(this));
                                                    View findViewById12 = findViewById(R.id.quoted_message_preview_container);
                                                    if (findViewById12 != null) {
                                                        ViewGroup viewGroup = (ViewGroup) findViewById12;
                                                        viewGroup.setVisibility(0);
                                                        viewGroup.addView(inflate);
                                                        TextView textView = (TextView) inflate.findViewById(R.id.quoted_title);
                                                        TextView textView2 = (TextView) inflate.findViewById(R.id.quoted_bullet_divider);
                                                        TextView textView3 = (TextView) inflate.findViewById(R.id.quoted_subtitle);
                                                        float A04 = AbstractC48182Ef.A04(getResources(), ((ActivityC02310Ar) this).A01);
                                                        textView.setTextSize(A04);
                                                        textView2.setTextSize(A04);
                                                        textView3.setTextSize(A04);
                                                        C003301p.A06(textView);
                                                        C003301p.A06(textView2);
                                                        C003301p.A06(textView3);
                                                        C2MM c2mm = this.A0M;
                                                        AbstractC005302j abstractC005302j2 = this.A0i;
                                                        AnonymousClass092 anonymousClass092 = this.A0v;
                                                        C43791xz c43791xz = this.A0z;
                                                        C0Zn c0Zn = this.A0I;
                                                        if (c0Zn == null) {
                                                            c0Zn = this.A0J.A04(this);
                                                            this.A0I = c0Zn;
                                                        }
                                                        c2mm.A01(inflate, abstractC005302j2, anonymousClass092, c43791xz, c0Zn);
                                                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                                                        translateAnimation.setDuration(200L);
                                                        translateAnimation.setStartOffset(300L);
                                                        translateAnimation.setFillBefore(true);
                                                        translateAnimation.setFillAfter(true);
                                                        translateAnimation.setInterpolator(new DecelerateInterpolator());
                                                        this.A01.startAnimation(translateAnimation);
                                                        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior() { // from class: com.whatsapp.status.playback.MessageReplyActivity.6
                                                            public final int[] A00 = new int[2];

                                                            {
                                                                MessageReplyActivity.this = this;
                                                            }

                                                            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                                                            public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
                                                                super.A08(coordinatorLayout, view, i);
                                                                C0AT.A0T(view, -view.getTop());
                                                                return true;
                                                            }

                                                            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                                                            public boolean A0B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                                                                boolean A0B = super.A0B(coordinatorLayout, view, motionEvent);
                                                                if (A0B) {
                                                                    MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                                    if (messageReplyActivity.A0m.getScrollY() > 0) {
                                                                        float rawX = motionEvent.getRawX();
                                                                        float rawY = motionEvent.getRawY();
                                                                        MentionableEntry mentionableEntry4 = messageReplyActivity.A0m;
                                                                        int[] iArr = this.A00;
                                                                        mentionableEntry4.getLocationOnScreen(iArr);
                                                                        int i = iArr[0];
                                                                        if (rawX > i && rawX < messageReplyActivity.A0m.getWidth() + i) {
                                                                            int i2 = iArr[1];
                                                                            if (rawY > i2 && rawY < messageReplyActivity.A0m.getHeight() + i2) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (messageReplyActivity.A1A.A0S()) {
                                                                        return false;
                                                                    }
                                                                    return A0B;
                                                                }
                                                                return A0B;
                                                            }
                                                        };
                                                        ((C08930cL) findViewById2.getLayoutParams()).A00(bottomSheetBehavior);
                                                        bottomSheetBehavior.A0E = new AbstractC08940cM() { // from class: X.3pj
                                                            {
                                                                MessageReplyActivity.this = this;
                                                            }

                                                            @Override // X.AbstractC08940cM
                                                            public void A00(View view, float f) {
                                                                if (f < 0.5f) {
                                                                    MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                                    if (messageReplyActivity.AFE()) {
                                                                        return;
                                                                    }
                                                                    messageReplyActivity.A1R();
                                                                    messageReplyActivity.finish();
                                                                }
                                                            }

                                                            @Override // X.AbstractC08940cM
                                                            public void A01(View view, int i) {
                                                                if (i == 4) {
                                                                    MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                                    messageReplyActivity.A1P();
                                                                    if (messageReplyActivity.AFE()) {
                                                                        return;
                                                                    }
                                                                    messageReplyActivity.A1R();
                                                                    messageReplyActivity.finish();
                                                                }
                                                            }
                                                        };
                                                        findViewById2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 42));
                                                        if (this.A0F.A0H(UserJid.of(this.A0i))) {
                                                            C002701i.A19(this, 106);
                                                        }
                                                        C54562ix c54562ix = new C54562ix(this, this, this.A0X, ((ActivityC02290Ap) this).A0A, ((ActivityC02270An) this).A0F, this.A08, this.A0A, this.A07, this.A0Z, this.A09, this.A0B, this.A0E, this.A0j, ((ActivityC02270An) this).A0C, this.A14, this.A0O, this.A0q, this.A0F, this.A0s, this.A0N, this.A0n, this.A0Q, ((ActivityC02290Ap) this).A0F, this.A0p, this.A0o, ((ActivityC02270An) this).A02, this.A0u, this.A0L, this, this.A1G, this.A0i, false, this.A0m, new C58312qw(), this.A0r);
                                                        this.A0K = c54562ix;
                                                        Set<Application.ActivityLifecycleCallbacks> set = this.A1I;
                                                        set.add(c54562ix);
                                                        this.A1H.add(this.A0K);
                                                        this.A1J.add(this.A0K);
                                                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : set) {
                                                            activityLifecycleCallbacks.onActivityCreated(this, bundle);
                                                        }
                                                        return;
                                                    }
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        C000200d.A0z("messagereply/message-deleted/", A02);
        ((ActivityC02290Ap) this).A0A.A07(R.string.status_deleted, 0);
        finish();
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 17) {
            C019208x c019208x = new C019208x(this);
            c019208x.A01.A0E = getString(R.string.cant_send_message_too_long_with_placeholder, 65536);
            c019208x.A06(R.string.send, new DialogInterface.OnClickListener() { // from class: X.3XF
                {
                    MessageReplyActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                    messageReplyActivity.A1T(true);
                    C002701i.A18(messageReplyActivity, 17);
                }
            });
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3XA
                {
                    MessageReplyActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(MessageReplyActivity.this, 17);
                }
            });
            return c019208x.A00();
        } else if (i != 106) {
            return super.onCreateDialog(i);
        } else {
            final C06C A0A = this.A0G.A0A(this.A0i);
            C019208x c019208x2 = new C019208x(this);
            String string = getString(R.string.cannot_send_to_blocked_contact_1, this.A0H.A08(A0A, false));
            C019308y c019308y = c019208x2.A01;
            c019308y.A0E = string;
            c019208x2.A06(R.string.unblock, new DialogInterface.OnClickListener() { // from class: X.3X8
                {
                    MessageReplyActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                    C06C c06c = A0A;
                    C40261rr c40261rr = messageReplyActivity.A0F;
                    Jid A03 = c06c.A03(UserJid.class);
                    if (A03 != null) {
                        c40261rr.A07(messageReplyActivity, null, (UserJid) A03);
                        C002701i.A18(messageReplyActivity, 106);
                        messageReplyActivity.A0m.A02(true);
                        return;
                    }
                    throw null;
                }
            });
            c019208x2.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3XD
                {
                    MessageReplyActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                    C002701i.A18(messageReplyActivity, 106);
                    messageReplyActivity.finish();
                }
            });
            c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3XC
                {
                    MessageReplyActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    MessageReplyActivity.this.finish();
                }
            };
            return c019208x2.A00();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C78833kb c78833kb = this.A0t;
        C48352Ex c48352Ex = c78833kb.A00;
        if (c48352Ex != null) {
            c48352Ex.A0J = null;
            c78833kb.A00 = null;
        }
        c78833kb.A02 = null;
        c78833kb.A01 = null;
        c78833kb.A04 = null;
        c78833kb.A03 = null;
        C73453bf c73453bf = this.A1A;
        if (c73453bf != null) {
            c73453bf.A02();
        }
        C48352Ex c48352Ex2 = this.A0a;
        if (c48352Ex2 != null) {
            c48352Ex2.A0B();
        }
        C43791xz c43791xz = this.A0z;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        C0Zn c0Zn = this.A0I;
        if (c0Zn != null) {
            c0Zn.A00();
            this.A0I = null;
        }
        C84143tG c84143tG = this.A17;
        if (c84143tG != null) {
            c84143tG.A05(true);
            this.A17 = null;
        }
        Set<Application.ActivityLifecycleCallbacks> set = this.A1I;
        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : set) {
            activityLifecycleCallbacks.onActivityDestroyed(this);
        }
        set.clear();
        this.A1H.clear();
        this.A1J.clear();
        C461225a c461225a = this.A12;
        c461225a.A0A.A00(c461225a.A09);
    }

    @Override // X.ActivityC02270An, X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (InterfaceC09830ep interfaceC09830ep : this.A1J) {
            if (interfaceC09830ep.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C73453bf c73453bf = this.A1A;
        if (c73453bf == null || !c73453bf.A0S()) {
            return;
        }
        c73453bf.A01();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.A1I) {
            activityLifecycleCallbacks.onActivityResumed(this);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        getWindow().setSoftInputMode((this.A0a.isShowing() ? 2 : 4) | 1);
        if (!this.A0a.isShowing()) {
            this.A0m.A02(true);
        }
        C84143tG c84143tG = this.A17;
        if (c84143tG != null) {
            c84143tG.A05(true);
            this.A17 = null;
        }
        C84143tG c84143tG2 = new C84143tG(this.A0S, this.A18, new InterfaceC73333bT() { // from class: X.3pU
            {
                MessageReplyActivity.this = this;
            }

            @Override // X.InterfaceC73333bT
            public final void AO9(C73343bU c73343bU) {
                AnonymousClass094 anonymousClass094;
                MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                C73353bV c73353bV = c73343bU.A01;
                if (c73353bV != null && (anonymousClass094 = c73353bV.A00) != null && anonymousClass094.equals(messageReplyActivity.A0v.A0n)) {
                    messageReplyActivity.A1A.A0I(c73353bV.A01, true);
                }
            }
        }, this.A0i);
        this.A17 = c84143tG2;
        this.A16.ARy(c84143tG2, new Void[0]);
    }
}
