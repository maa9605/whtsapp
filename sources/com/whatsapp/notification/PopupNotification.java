package com.whatsapp.notification;

import X.AbstractActivityC454121w;
import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass223;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C001200o;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C005002g;
import X.C008103m;
import X.C00A;
import X.C00T;
import X.C012005w;
import X.C018308n;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C02160Ac;
import X.C02180Ae;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02O;
import X.C03120Eg;
import X.C03150Ej;
import X.C03180Eq;
import X.C03320Ff;
import X.C03360Fk;
import X.C03750Gx;
import X.C04040Ie;
import X.C04950Mp;
import X.C05480Ox;
import X.C05M;
import X.C05U;
import X.C05W;
import X.C06030Rg;
import X.C06040Rh;
import X.C06C;
import X.C06K;
import X.C09560eJ;
import X.C09I;
import X.C0C8;
import X.C0CA;
import X.C0CB;
import X.C0DK;
import X.C0G2;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0H9;
import X.C0HA;
import X.C0JM;
import X.C0L5;
import X.C0L6;
import X.C0L7;
import X.C0L9;
import X.C0LF;
import X.C0LM;
import X.C0We;
import X.C0Z8;
import X.C0ZT;
import X.C0Zn;
import X.C22I;
import X.C26Y;
import X.C2AR;
import X.C2JT;
import X.C2LR;
import X.C2MB;
import X.C2MI;
import X.C2MM;
import X.C2MV;
import X.C40081rY;
import X.C40261rr;
import X.C40301ry;
import X.C41221tZ;
import X.C41461tx;
import X.C41491u0;
import X.C41771uU;
import X.C42381ve;
import X.C42391vf;
import X.C42401vg;
import X.C42471vn;
import X.C43791xz;
import X.C43871y8;
import X.C455822q;
import X.C459724l;
import X.C47232Ak;
import X.C47682Ce;
import X.C48362Ey;
import X.C51282Vt;
import X.C649335g;
import X.C73453bf;
import X.C76803hB;
import X.C76863hH;
import X.InterfaceC002901k;
import X.InterfaceC04830Lz;
import X.InterfaceC06590Tz;
import X.InterfaceC09180cm;
import X.InterfaceC60692ut;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.notification.PopupNotificationViewPager;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class PopupNotification extends AbstractActivityC454121w {
    public int A01;
    public Sensor A02;
    public SensorEventListener A03;
    public SensorManager A04;
    public PowerManager.WakeLock A05;
    public View.OnClickListener A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageButton A0B;
    public ImageButton A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public C018308n A0G;
    public C06040Rh A0H;
    public C012005w A0J;
    public C018508q A0K;
    public C005002g A0L;
    public C03150Ej A0M;
    public C04950Mp A0N;
    public C0LM A0O;
    public C06030Rg A0P;
    public C09I A0Q;
    public C018608r A0R;
    public C0G2 A0S;
    public C06K A0T;
    public C40261rr A0U;
    public C03320Ff A0V;
    public C649335g A0W;
    public C0L7 A0X;
    public C05W A0Y;
    public AnonymousClass008 A0Z;
    public C018708s A0a;
    public C0Zn A0b;
    public C0L5 A0c;
    public C0LF A0d;
    public C41221tZ A0e;
    public C2LR A0f;
    public C42381ve A0g;
    public C03120Eg A0h;
    public C2MM A0i;
    public C000400f A0j;
    public C02E A0k;
    public AnonymousClass012 A0l;
    public C001200o A0m;
    public C02F A0n;
    public C000500h A0o;
    public C000500h A0p;
    public C002301c A0q;
    public C05M A0r;
    public C0DK A0s;
    public C0CA A0t;
    public C0C8 A0u;
    public C03180Eq A0v;
    public C00A A0w;
    public C06C A0x;
    public C43871y8 A0y;
    public C40081rY A0z;
    public C47682Ce A10;
    public AnonymousClass223 A11;
    public C2MI A12;
    public C0L9 A13;
    public C0HA A14;
    public AnonymousClass011 A15;
    public C455822q A16;
    public C03360Fk A17;
    public AbstractC005302j A18;
    public C41461tx A19;
    public C41491u0 A1A;
    public C41771uU A1B;
    public C02980Dr A1C;
    public C40301ry A1D;
    public C459724l A1E;
    public PopupNotificationViewPager A1F;
    public C03750Gx A1G;
    public C02O A1H;
    public C47232Ak A1I;
    public C26Y A1J;
    public C22I A1K;
    public AnonymousClass092 A1L;
    public C05U A1M;
    public C008103m A1N;
    public C0CB A1O;
    public C2AR A1P;
    public C43791xz A1Q;
    public C0H9 A1R;
    public C42391vf A1S;
    public C2MB A1T;
    public C42471vn A1U;
    public InterfaceC002901k A1V;
    public C2MV A1W;
    public C42401vg A1X;
    public C73453bf A1Y;
    public C05480Ox A1Z;
    public C0L6 A1a;
    public Integer A1b;
    public boolean A1g;
    public boolean A1h;
    public List A1f = new ArrayList();
    public HashSet A1e = new HashSet();
    public HashSet A1d = new HashSet();
    public HashSet A1c = new HashSet();
    public final C76803hB A1o = new C76803hB(this);
    public final C00T A1m = new C00T() { // from class: X.3hC
        {
            PopupNotification.this = this;
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            View findViewWithTag;
            StickerView stickerView;
            if (anonymousClass092.A0m == 20) {
                PopupNotification popupNotification = PopupNotification.this;
                if (!popupNotification.A1f.contains(anonymousClass092) || i != 3 || (findViewWithTag = popupNotification.A1F.findViewWithTag(anonymousClass092.A0n)) == null || (stickerView = (StickerView) findViewWithTag.findViewById(R.id.popup_sticker_view)) == null) {
                    return;
                }
                popupNotification.A1O((C04040Ie) anonymousClass092, stickerView);
            }
        }
    };
    public final C0GA A1l = new C0GA() { // from class: X.3hD
        {
            PopupNotification.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            PopupNotification.A01(PopupNotification.this);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            PopupNotification popupNotification = PopupNotification.this;
            C06C c06c = popupNotification.A0x;
            if (c06c == null || abstractC005302j == null || !abstractC005302j.equals(c06c.A02())) {
                return;
            }
            popupNotification.A1L();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            PopupNotification popupNotification = PopupNotification.this;
            if (popupNotification.A1f.isEmpty()) {
                return;
            }
            AbstractC005302j abstractC005302j = popupNotification.A1L.A0n.A00;
            if (abstractC005302j != null) {
                if (abstractC005302j.equals(userJid) || userJid.equals(popupNotification.A1L.A0A())) {
                    popupNotification.A1M(popupNotification.A1F.getCurrentItem());
                    return;
                }
                return;
            }
            throw null;
        }
    };
    public final C0GC A1k = new C0GC() { // from class: X.3hE
        {
            PopupNotification.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            PopupNotification.A01(PopupNotification.this);
        }

        @Override // X.C0GC
        public void A01(AbstractC005302j abstractC005302j) {
            PopupNotification popupNotification = PopupNotification.this;
            C06C c06c = popupNotification.A0x;
            if (c06c != null && abstractC005302j != null && abstractC005302j.equals(c06c.A02()) && !C003101m.A0U(abstractC005302j)) {
                String A00 = popupNotification.A0H.A00(popupNotification.A0x);
                if (TextUtils.isEmpty(A00)) {
                    popupNotification.A0F.setVisibility(8);
                    return;
                }
                popupNotification.A0F.setVisibility(0);
                popupNotification.A0F.setText(A00);
            }
        }
    };
    public final C0GE A1n = new C0GE() { // from class: X.3hF
        {
            PopupNotification.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            PopupNotification.A01(PopupNotification.this);
        }
    };
    public InterfaceC09180cm A0I = new InterfaceC09180cm() { // from class: X.3hJ
        {
            PopupNotification.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            PopupNotification.this.A0f.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            PopupNotification popupNotification = PopupNotification.this;
            if (popupNotification.A1Y.A0S()) {
                return;
            }
            C002701i.A1H(popupNotification.A0f, iArr, 0);
        }
    };
    public float A00 = 5.0f;
    public final Handler A1i = new Handler(Looper.getMainLooper());
    public final Runnable A1p = new RunnableEBaseShape4S0100000_I0_4(this, 37);
    public final Handler A1j = new Handler(Looper.getMainLooper());
    public final Runnable A1q = new RunnableEBaseShape4S0100000_I0_4(this, 38);

    @Override // X.ActivityC02290Ap, X.C0B5
    public boolean AFE() {
        return false;
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void ARS() {
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUg(DialogFragment dialogFragment, String str) {
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUh(DialogFragment dialogFragment) {
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUr(int i, int i2) {
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AVr(String str) {
    }

    public static void A00(PopupNotification popupNotification) {
        Log.i("popupnotification/wakeup");
        PowerManager.WakeLock wakeLock = popupNotification.A05;
        if (wakeLock != null && !wakeLock.isHeld()) {
            popupNotification.A05.acquire();
        }
        Handler handler = popupNotification.A1i;
        Runnable runnable = popupNotification.A1p;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    public static void A01(PopupNotification popupNotification) {
        if (popupNotification.A1f.isEmpty()) {
            return;
        }
        popupNotification.A1M(popupNotification.A1F.getCurrentItem());
    }

    @Override // X.ActivityC02290Ap
    public void A13(int i, int i2, int i3, InterfaceC06590Tz interfaceC06590Tz) {
        AUl(i, i2, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0016, code lost:
        if (A1P() != false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1G() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A1G():void");
    }

    public final void A1H() {
        findViewById(R.id.navigation_holder).setVisibility(8);
        findViewById(R.id.navigation_divider).setVisibility(8);
        this.A07.setVisibility(8);
        this.A08.setVisibility(8);
    }

    public final void A1I() {
        this.A0e.A03((AbstractC005302j) this.A0x.A03(AbstractC005302j.class), true, true);
        InputMethodManager A0I = this.A0k.A0I();
        if (A0I != null && A0I.isFullscreenMode()) {
            A0I.hideSoftInputFromWindow(this.A0f.getWindowToken(), 0);
        }
        int currentItem = this.A1F.getCurrentItem();
        StringBuilder A0Q = C000200d.A0Q("popupnotification/moveToNextMessageOrExit/ message_pos:", currentItem, " messages.size:");
        A0Q.append(this.A1f.size());
        Log.i(A0Q.toString());
        this.A1d.add(((AnonymousClass092) this.A1f.get(currentItem)).A0n);
        if (this.A1f.size() == 1 || (this.A18 != null && this.A01 == 1)) {
            A1J();
            finish();
            return;
        }
        int i = currentItem + 1;
        if (currentItem == this.A1f.size() - 1) {
            i = currentItem - 1;
        }
        this.A1b = Integer.valueOf(currentItem);
        this.A1F.A0O(i, true, false);
        if (this.A1f.size() == 1) {
            A1H();
        }
        AnonymousClass092 anonymousClass092 = this.A1L;
        if (anonymousClass092 != null) {
            this.A1e.add(anonymousClass092.A0n);
        }
        C06C c06c = this.A0x;
        if (c06c != null) {
            this.A1c.add(c06c.A03(AbstractC005302j.class));
        }
    }

    public final void A1J() {
        StringBuilder A0P = C000200d.A0P("popupnotification/clearnotifications:");
        A0P.append(this.A1c.size());
        Log.i(A0P.toString());
        this.A1I.A02(true);
        this.A18 = null;
        Iterator it = this.A1c.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            ArrayList arrayList = new ArrayList();
            int A01 = this.A0r.A01(abstractC005302j);
            Iterator it2 = this.A1e.iterator();
            while (it2.hasNext()) {
                AnonymousClass094 anonymousClass094 = (AnonymousClass094) it2.next();
                AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
                if (abstractC005302j2 != null && abstractC005302j2.equals(abstractC005302j)) {
                    arrayList.add(anonymousClass094);
                }
            }
            StringBuilder A0P2 = C000200d.A0P("popupnotification/msg:");
            A0P2.append(arrayList.size());
            A0P2.append("/");
            A0P2.append(A01);
            Log.i(A0P2.toString());
            if (arrayList.size() == A01) {
                this.A0e.A03(abstractC005302j, true, true);
                this.A1e.removeAll(arrayList);
            }
        }
        this.A1E.A00 = null;
        this.A1D.A04();
    }

    public final void A1K() {
        C06C c06c = this.A0x;
        if (c06c == null) {
            return;
        }
        if (this.A0U.A0H((UserJid) c06c.A03(UserJid.class))) {
            C002701i.A19(this, 106);
            return;
        }
        String trim = this.A0f.getText().toString().trim();
        if (trim.length() > 0) {
            if (AnonymousClass029.A1R(this.A0k, this.A1H, trim)) {
                this.A0R.A0d(Collections.singletonList(this.A0x.A03(AbstractC005302j.class)), C002701i.A0t(trim), null, null, null, false, false);
                TextKeyListener.clear(this.A0f.getText());
            } else {
                this.A0K.A07(R.string.cannot_send_empty_text_message, 1);
            }
            A1I();
            return;
        }
        StringBuilder A0P = C000200d.A0P("popupnotification/sendentry/empty text ");
        A0P.append(this.A1f.size());
        Log.i(A0P.toString());
    }

    public final void A1L() {
        C06C c06c = this.A0x;
        if (c06c != null) {
            Bitmap A02 = this.A0d.A02(this, c06c, getResources().getDimensionPixelSize(R.dimen.small_avatar_size), getResources().getDimension(R.dimen.small_avatar_radius), true);
            if (A02 == null) {
                C0L7 c0l7 = this.A0X;
                A02 = c0l7.A00.A00(this, c0l7.A03(this.A0x));
            }
            ((ImageView) findViewById(R.id.popup_thumb)).setImageBitmap(A02);
        }
    }

    public final void A1M(int i) {
        int size;
        AbstractC005302j abstractC005302j;
        while (true) {
            size = this.A1f.size();
            if (i >= 0) {
                break;
            }
            i += size;
        }
        int i2 = i % size;
        AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A1f.get(i2);
        this.A1L = anonymousClass092;
        AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
        C73453bf c73453bf = this.A1Y;
        if (!c73453bf.A0S()) {
            c73453bf.A0G(abstractC005302j2);
        }
        C06C A02 = this.A0s.A02(abstractC005302j2);
        this.A0x = A02;
        if (C003101m.A0Y(A02.A02())) {
            this.A09.setVisibility(8);
            this.A0E.setVisibility(0);
            this.A0E.setText(R.string.cant_send_official_announcements);
        } else if (A02.A0C() && !this.A0u.A05((GroupJid) abstractC005302j2)) {
            this.A09.setVisibility(8);
            this.A0E.setVisibility(0);
            TextView textView = this.A0E;
            boolean z = this.A0x.A0S;
            int i3 = R.string.cannot_send_not_a_group_participant;
            if (z) {
                i3 = R.string.cannot_send_chat_has_been_closed;
            }
            textView.setText(getString(i3));
        } else {
            if (this.A0x.A0C()) {
                GroupJid groupJid = (GroupJid) abstractC005302j2;
                if (this.A0u.A05(groupJid) && this.A0x.A0Q && !this.A0u.A06(groupJid)) {
                    this.A09.setVisibility(8);
                    this.A0E.setVisibility(0);
                    this.A0E.setText(Html.fromHtml(getString(R.string.group_announcement_footer_description, "000000")).toString());
                }
            }
            this.A09.setVisibility(0);
            this.A0E.setVisibility(8);
        }
        if (!this.A1J.A01() && !this.A0x.A0C() && (abstractC005302j = (AbstractC005302j) this.A0x.A03(UserJid.class)) != null) {
            this.A1K.A07(abstractC005302j);
        }
        if (this.A1f.size() == 1 || this.A1h) {
            this.A1e.add(this.A1L.A0n);
            this.A1c.add(this.A0x.A03(AbstractC005302j.class));
            this.A1h = false;
        }
        A1L();
        int i4 = R.string.view;
        if (this.A1L.A0m == 3) {
            i4 = R.string.watch;
        }
        this.A0A.setText(i4);
        this.A0P.A03(this.A0x, null);
        if (this.A0x.A0C()) {
            AbstractC005302j A0A = this.A1L.A0A();
            if (A0A == null) {
                this.A0F.setVisibility(8);
            } else {
                this.A0F.setText(this.A0a.A08(this.A0Y.A0A(A0A), false));
                this.A0F.setVisibility(0);
            }
        } else {
            String A00 = this.A0H.A00(this.A0x);
            if (TextUtils.isEmpty(A00)) {
                this.A0F.setVisibility(8);
            } else {
                this.A0F.setVisibility(0);
                this.A0F.setText(A00);
            }
        }
        this.A0D.setText(getString(R.string.media_view_x_of_y, Integer.valueOf(i2 + 1), Integer.valueOf(this.A1f.size())));
        this.A0B.setEnabled(this.A0f.getText().toString().length() != 0);
    }

    public final void A1N(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.popup_gallery_height);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.image_button_padding);
        thumbnailButton.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        thumbnailButton.A02 = getResources().getDimension(R.dimen.thumb_round_radius);
        if (thumbnailButton instanceof C51282Vt) {
            C51282Vt c51282Vt = (C51282Vt) thumbnailButton;
            c51282Vt.A00 = dimensionPixelSize / 7.0f;
            c51282Vt.A03 = 5;
        }
    }

    public final void A1O(C04040Ie c04040Ie, StickerView stickerView) {
        C0JM A1H = c04040Ie.A1H();
        if (A1H.A08 == null) {
            stickerView.setImageResource(R.drawable.sticker_error_in_conversation);
        }
        int dimensionPixelSize = stickerView.getContext().getResources().getDimensionPixelSize(R.dimen.popup_notification_sticker_size);
        this.A1Q.A06(A1H, 1, stickerView, dimensionPixelSize, dimensionPixelSize, false, false, null);
    }

    public final boolean A1P() {
        return this.A0f.getText().toString().length() > 0 || this.A1Y.A0S();
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUj(int i) {
        C018508q c018508q = this.A0K;
        c018508q.A0E(c018508q.A04.A00.getString(i), 0);
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUk(int i, int i2, int i3, InterfaceC06590Tz interfaceC06590Tz, Object... objArr) {
        AUl(i, i2, objArr);
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUl(int i, int i2, Object... objArr) {
        this.A0K.A0E(getString(i2, objArr), 0);
    }

    @Override // X.ActivityC02290Ap, X.C0B5
    public void AUm(String str) {
        this.A0K.A02(str, 0).show();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C09560eJ c09560eJ = this.A0h.A00;
        return (c09560eJ == null || !c09560eJ.A0O) && super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onCreate$2040$PopupNotification(View view) {
        this.A1R.A01();
        A1J();
        finish();
    }

    public void lambda$onCreate$2041$PopupNotification(View view) {
        this.A1R.A01();
        String trim = this.A0f.getText().toString().trim();
        C06C c06c = this.A0x;
        if (c06c != null && trim.length() > 0) {
            Conversation.A56.put(c06c.A03(AbstractC005302j.class), trim);
        }
        this.A0G.A07(this, Conversation.A00(this, this.A0s.A02(this.A1L.A0n.A00)));
        A1J();
        finish();
    }

    public void lambda$onCreate$2042$PopupNotification(View view) {
        if (A1P()) {
            return;
        }
        this.A1I.A02(true);
        AnonymousClass092 anonymousClass092 = this.A1L;
        if (anonymousClass092 != null) {
            this.A1e.add(anonymousClass092.A0n);
        }
        C06C c06c = this.A0x;
        if (c06c != null) {
            this.A1c.add(c06c.A03(AbstractC005302j.class));
        }
        this.A1h = true;
        if (this.A1f.size() > 1) {
            PopupNotificationViewPager popupNotificationViewPager = this.A1F;
            popupNotificationViewPager.A0O(popupNotificationViewPager.getCurrentItem() + 1, true, false);
            int currentItem = this.A1F.getCurrentItem();
            A1M(currentItem < this.A1f.size() ? currentItem : 0);
        }
    }

    public void lambda$onCreate$2043$PopupNotification(View view) {
        if (A1P()) {
            return;
        }
        this.A1I.A02(true);
        AnonymousClass092 anonymousClass092 = this.A1L;
        if (anonymousClass092 != null) {
            this.A1e.add(anonymousClass092.A0n);
        }
        C06C c06c = this.A0x;
        if (c06c != null) {
            this.A1c.add(c06c.A03(AbstractC005302j.class));
        }
        this.A1h = true;
        if (this.A1f.size() > 1) {
            PopupNotificationViewPager popupNotificationViewPager = this.A1F;
            popupNotificationViewPager.A0O(popupNotificationViewPager.getCurrentItem() - 1, true, false);
            int currentItem = this.A1F.getCurrentItem();
            if (currentItem < 0) {
                currentItem = this.A1f.size() - 1;
            }
            A1M(currentItem);
        }
    }

    public void lambda$onCreate$2044$PopupNotification(View view) {
        this.A1I.A02(true);
        AnonymousClass092 anonymousClass092 = this.A1L;
        if (anonymousClass092 != null) {
            this.A1e.add(anonymousClass092.A0n);
        }
        C06C c06c = this.A0x;
        if (c06c != null) {
            this.A1c.add(c06c.A03(AbstractC005302j.class));
        }
    }

    public /* synthetic */ void lambda$onCreate$2047$PopupNotification(View view) {
        A1K();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        A1J();
        super.onBackPressed();
    }

    @Override // X.AbstractActivityC454121w, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= 17) {
            getWindow().getDecorView().setLayoutDirection(3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, 17170445));
        }
        super.onCreate(bundle);
        boolean z = this.A0M.A00;
        int i = R.color.popup_dim;
        if (z) {
            i = R.color.black;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(C02160Ac.A00(this, i)));
        SensorManager A08 = this.A0k.A08();
        if (A08 != null) {
            this.A04 = A08;
            this.A02 = A08.getDefaultSensor(8);
            PowerManager A0D = this.A0k.A0D();
            if (A0D != null) {
                this.A05 = C02180Ae.A0R(A0D, 268435466, "popupnotification");
            } else {
                Log.w("popupnotification/create pm=null");
            }
            setContentView(getLayoutInflater().inflate(R.layout.popup_notification, (ViewGroup) null, false));
            this.A1F = (PopupNotificationViewPager) findViewById(R.id.message_view_pager);
            C2LR c2lr = (C2LR) findViewById(R.id.entry);
            this.A0f = c2lr;
            c2lr.setFilters(new InputFilter[]{new InputFilter() { // from class: X.3N6
                {
                    PopupNotification.this = this;
                }

                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                    if (PopupNotification.this.A1Y.A0S()) {
                        return "";
                    }
                    return null;
                }
            }});
            this.A0A = (Button) findViewById(R.id.popup_action_btn);
            this.A0P = new C06030Rg(this, (TextEmojiLabel) findViewById(R.id.popup_title), this.A0a, this.A1P);
            this.A0F = (TextView) findViewById(R.id.conversation_contact_status);
            this.A0D = (TextView) findViewById(R.id.popup_count);
            ImageView imageView = (ImageView) findViewById(R.id.next_btn);
            imageView.setImageDrawable(new C0We(this.A0q, getResources().getDrawable(R.drawable.selector_media_next)));
            this.A07 = findViewById(R.id.next_btn_ext);
            ImageView imageView2 = (ImageView) findViewById(R.id.prev_btn);
            imageView2.setImageDrawable(new C0We(this.A0q, getResources().getDrawable(R.drawable.selector_media_prev)));
            this.A08 = findViewById(R.id.prev_btn_ext);
            this.A0E = (TextView) findViewById(R.id.read_only_chat_info);
            this.A09 = findViewById(R.id.emoji_popup_anchor);
            this.A0B = (ImageButton) findViewById(R.id.send);
            ImageButton imageButton = (ImageButton) findViewById(R.id.voice_note_btn);
            this.A0C = imageButton;
            imageButton.setLongClickable(true);
            C649335g c649335g = new C649335g(new C0ZT() { // from class: X.3hL
                @Override // X.C0ZT
                public boolean A0E(View view, Object obj) {
                    return view == obj;
                }

                {
                    PopupNotification.this = this;
                }

                @Override // X.C0ZT
                public int A0B() {
                    List list = PopupNotification.this.A1f;
                    if (list == null) {
                        return 0;
                    }
                    return list.size();
                }

                /* JADX WARN: Code restructure failed: missing block: B:202:0x005f, code lost:
                    if (r3.A0C() != null) goto L33;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:201:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:210:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x01ad  */
                /* JADX WARN: Type inference failed for: r8v22 */
                /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r8v24 */
                @Override // X.C0ZT
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object A0C(android.view.ViewGroup r21, int r22) {
                    /*
                        Method dump skipped, instructions count: 2086
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C76903hL.A0C(android.view.ViewGroup, int):java.lang.Object");
                }

                @Override // X.C0ZT
                public void A0D(ViewGroup viewGroup, int i2, Object obj) {
                    viewGroup.removeView((View) obj);
                }
            });
            this.A0W = c649335g;
            this.A1F.setAdapter(c649335g);
            this.A1F.setOnTouchListener(new View.OnTouchListener() { // from class: X.3N8
                {
                    PopupNotification.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return PopupNotification.this.A1P();
                }
            });
            this.A1F.A0F(new C0Z8() { // from class: X.3hG
                {
                    PopupNotification.this = this;
                }

                @Override // X.C0Z8
                public void AMg(int i2) {
                    PopupNotification popupNotification;
                    Integer num;
                    if (i2 == 1) {
                        PopupNotification.this.A1h = true;
                    } else if (i2 != 0 || (num = (popupNotification = PopupNotification.this).A1b) == null) {
                    } else {
                        popupNotification.A1f.remove(num.intValue());
                        if (popupNotification.A1b.intValue() >= popupNotification.A1f.size()) {
                            popupNotification.A1b = Integer.valueOf(popupNotification.A1b.intValue() - 1);
                        }
                        popupNotification.A0W.A00.A04();
                        PopupNotificationViewPager popupNotificationViewPager = popupNotification.A1F;
                        C649335g c649335g2 = popupNotification.A0W;
                        int intValue = popupNotification.A1b.intValue();
                        popupNotificationViewPager.setAdapter(c649335g2);
                        popupNotificationViewPager.setCurrentItem(intValue);
                        popupNotification.A1M(popupNotification.A1F.getCurrentItem());
                        if (popupNotification.A1f.size() == 1) {
                            popupNotification.A1H();
                        }
                        popupNotification.A1b = null;
                    }
                }

                @Override // X.C0Z8
                public void AMh(int i2, float f, int i3) {
                    PopupNotification popupNotification = PopupNotification.this;
                    if (popupNotification.A1h) {
                        popupNotification.A1I.A02(true);
                        AnonymousClass092 anonymousClass092 = popupNotification.A1L;
                        if (anonymousClass092 != null) {
                            popupNotification.A1e.add(anonymousClass092.A0n);
                        }
                        C06C c06c = popupNotification.A0x;
                        if (c06c != null) {
                            popupNotification.A1c.add(c06c.A03(AbstractC005302j.class));
                        }
                    }
                }

                @Override // X.C0Z8
                public void AMi(int i2) {
                    PopupNotification popupNotification = PopupNotification.this;
                    if (popupNotification.A1b == null) {
                        popupNotification.A1M(popupNotification.A1F.getCurrentItem());
                    }
                }
            });
            findViewById(R.id.popup_ok_btn).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 15));
            ViewOnClickEBaseShape3S0100000_I0_3 viewOnClickEBaseShape3S0100000_I0_3 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 10);
            this.A06 = viewOnClickEBaseShape3S0100000_I0_3;
            this.A0A.setOnClickListener(viewOnClickEBaseShape3S0100000_I0_3);
            ViewOnClickEBaseShape3S0100000_I0_3 viewOnClickEBaseShape3S0100000_I0_32 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 13);
            imageView.setOnClickListener(viewOnClickEBaseShape3S0100000_I0_32);
            this.A07.setOnClickListener(viewOnClickEBaseShape3S0100000_I0_32);
            ViewOnClickEBaseShape3S0100000_I0_3 viewOnClickEBaseShape3S0100000_I0_33 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 11);
            imageView2.setOnClickListener(viewOnClickEBaseShape3S0100000_I0_33);
            this.A08.setOnClickListener(viewOnClickEBaseShape3S0100000_I0_33);
            this.A0B.setImageDrawable(new C0We(this.A0q, C02160Ac.A03(this, R.drawable.input_send)));
            View findViewById = findViewById(R.id.input_layout);
            findViewById.setBackgroundResource(R.drawable.ib_new_round);
            findViewById.setPadding(0, 0, 0, 0);
            View findViewById2 = findViewById(R.id.text_entry_layout);
            if (findViewById2 != null) {
                int max = Math.max(findViewById2.getPaddingLeft(), findViewById2.getPaddingRight());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
                if (this.A0q.A0M()) {
                    layoutParams.rightMargin = max;
                } else {
                    layoutParams.leftMargin = max;
                }
                findViewById2.setLayoutParams(layoutParams);
                this.A0f.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 12));
                getLayoutInflater().inflate(R.layout.voice_note_view, (ViewGroup) findViewById(R.id.voice_note_stub), true);
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.root_layout);
                this.A1Y = new C76863hH(this, this, this, keyboardPopupLayout, this.A0l, super.A0I, this.A0K, this.A1V, this.A0J, this.A15, this.A1S, super.A0B, this.A0R, this.A1A, this.A1Z, this.A1a, this.A0k, this.A0q, this.A1M, this.A0U, this.A14, this.A0j, this.A1U, this.A13, this.A1X, this.A0o, this.A0S, this.A1W, this.A1B, this.A1H, this.A1N, this.A0h, Build.VERSION.SDK_INT != 26);
                this.A0C.setOnTouchListener(new View.OnTouchListener() { // from class: X.3N7
                    {
                        PopupNotification.this = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        PopupNotification popupNotification = PopupNotification.this;
                        if (!popupNotification.A11.A01()) {
                            popupNotification.A1Y.A0T(popupNotification.A0C, motionEvent, false);
                        }
                        return false;
                    }
                });
                this.A0C.setVisibility(0);
                this.A0B.setVisibility(8);
                this.A0f.addTextChangedListener(new C2JT() { // from class: X.3hI
                    {
                        PopupNotification.this = this;
                    }

                    @Override // X.C2JT, android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        PopupNotification popupNotification = PopupNotification.this;
                        popupNotification.A1I.A02(true);
                        String obj = editable.toString();
                        C06C c06c = popupNotification.A0x;
                        if (c06c != null) {
                            int length = obj.length();
                            C018608r c018608r = popupNotification.A0R;
                            if (length != 0) {
                                c018608r.A0I((AbstractC005302j) c06c.A03(AbstractC005302j.class), 0);
                            } else {
                                c018608r.A0G((AbstractC005302j) c06c.A03(AbstractC005302j.class));
                            }
                        }
                        AnonymousClass029.A17(popupNotification, popupNotification.A0z, popupNotification.A0k, popupNotification.A1H, editable, popupNotification.A0f.getPaint());
                        boolean z2 = !AnonymousClass024.A0j(obj);
                        popupNotification.A0B.setEnabled(z2);
                        if (popupNotification.A0C.getVisibility() == 8 && !z2) {
                            popupNotification.A0C.startAnimation(C73453bf.A00(true));
                            popupNotification.A0C.setVisibility(0);
                            popupNotification.A0B.startAnimation(C73453bf.A00(false));
                            popupNotification.A0B.setVisibility(8);
                        } else if (popupNotification.A0C.getVisibility() != 0 || !z2) {
                        } else {
                            popupNotification.A0C.startAnimation(C73453bf.A00(false));
                            popupNotification.A0C.setVisibility(8);
                            popupNotification.A0B.startAnimation(C73453bf.A00(true));
                            popupNotification.A0B.setVisibility(0);
                        }
                    }
                });
                this.A0f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3N3
                    {
                        PopupNotification.this = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                        PopupNotification popupNotification = PopupNotification.this;
                        if (i2 == 4) {
                            popupNotification.A1K();
                            return true;
                        }
                        return false;
                    }
                });
                this.A0B.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 14));
                C48362Ey c48362Ey = new C48362Ey(this, this.A16, this.A1T, ((ActivityC02290Ap) this).A08, this.A0z, this.A0y, this.A10, this.A0k, this.A0q, this.A12, this.A0p, this.A1H, keyboardPopupLayout, (ImageButton) findViewById(R.id.emoji_picker_btn), this.A0f);
                c48362Ey.A0A(this.A0I);
                c48362Ey.A09 = new InterfaceC60692ut() { // from class: X.3h7
                    {
                        PopupNotification.this = this;
                    }

                    @Override // X.InterfaceC60692ut
                    public final boolean AFL() {
                        C73453bf c73453bf = PopupNotification.this.A1Y;
                        return c73453bf == null || !c73453bf.A0S();
                    }
                };
                AnonymousClass223 anonymousClass223 = new AnonymousClass223((EmojiSearchContainer) findViewById(R.id.popup_search_container), c48362Ey, this, this.A0z, this.A10, this.A0q, this.A1H);
                this.A11 = anonymousClass223;
                anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3h8
                    {
                        PopupNotification.this = this;
                    }

                    @Override // X.InterfaceC04830Lz
                    public final void AJj(C2CI c2ci) {
                        PopupNotification.this.A0I.AJi(c2ci.A00);
                    }
                };
                if (getIntent().getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
                    this.A1D.A0C(false);
                    this.A1I.A02(true);
                }
                AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid"));
                C000200d.A0v("popupnotification/set-quick-reply-jid:", A02);
                this.A18 = A02;
                A1G();
                this.A0w.A01(this.A1m);
                this.A0Z.A01(this.A1l);
                this.A0V.A01(this.A1k);
                this.A17.A01(this.A1n);
                if (this.A0N.A01(this.A0L) > 0) {
                    C002701i.A19(this, 115);
                }
                if (this.A18 != null) {
                    getWindow().setSoftInputMode(4);
                }
                this.A1E.A00 = this.A1o;
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 106) {
            if (i != 115) {
                return super.onCreateDialog(i);
            }
            Log.i("popupnotification/dialog-software-about-to-expire");
            return this.A0N.A02(this, this.A0Q, this.A0L);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A01.A0E = getString(R.string.cannot_send_to_blocked_contact_1, this.A0a.A08(this.A0x, false));
        c019208x.A06(R.string.unblock, new DialogInterface.OnClickListener() { // from class: X.3N9
            {
                PopupNotification.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PopupNotification popupNotification = PopupNotification.this;
                C40261rr c40261rr = popupNotification.A0U;
                Jid A03 = popupNotification.A0x.A03(UserJid.class);
                if (A03 != null) {
                    c40261rr.A07(popupNotification, null, (UserJid) A03);
                    C002701i.A18(popupNotification, 106);
                    return;
                }
                throw null;
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3N5
            {
                PopupNotification.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C002701i.A18(PopupNotification.this, 106);
            }
        });
        return c019208x.A00();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C43791xz c43791xz = this.A1Q;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        C0Zn c0Zn = this.A0b;
        if (c0Zn != null) {
            c0Zn.A00();
            this.A0b = null;
        }
        C73453bf c73453bf = this.A1Y;
        if (c73453bf != null) {
            c73453bf.A02();
        }
        this.A18 = null;
        this.A1i.removeCallbacks(this.A1p);
        this.A1j.removeCallbacks(this.A1q);
        PowerManager.WakeLock wakeLock = this.A05;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.A05.release();
        }
        SensorEventListener sensorEventListener = this.A03;
        if (sensorEventListener != null) {
            this.A04.unregisterListener(sensorEventListener);
        }
        this.A0h.A05();
        this.A0w.A00(this.A1m);
        this.A0Z.A00(this.A1l);
        this.A0V.A00(this.A1k);
        this.A17.A00(this.A1n);
        this.A1E.A00 = null;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        Log.i("popupnotification/new-intent");
        super.onNewIntent(intent);
        setIntent(intent);
        AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid"));
        C000200d.A0v("popupnotification/set-quick-reply-jid:", A02);
        this.A18 = A02;
        if (intent.getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A1D.A0C(false);
            this.A1I.A02(true);
        }
        A1G();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A1Y.A0P(false, false, true);
        this.A1I.A01();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A1g = true;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A1g = false;
        this.A1Y.A0P(false, false, true);
    }
}
