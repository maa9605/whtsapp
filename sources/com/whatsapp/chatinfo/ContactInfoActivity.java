package com.whatsapp.chatinfo;

import X.AbstractC09240cu;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass031;
import X.AnonymousClass075;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C003701t;
import X.C00A;
import X.C00T;
import X.C018308n;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C018808t;
import X.C01B;
import X.C02160Ac;
import X.C02F;
import X.C02L;
import X.C03230Ew;
import X.C03320Ff;
import X.C03340Fh;
import X.C03360Fk;
import X.C03690Gr;
import X.C04110Ip;
import X.C04400Ka;
import X.C04630Le;
import X.C05M;
import X.C05Q;
import X.C05W;
import X.C05X;
import X.C05Y;
import X.C06040Rh;
import X.C06C;
import X.C06K;
import X.C06L;
import X.C06M;
import X.C06S;
import X.C0AT;
import X.C0C8;
import X.C0CB;
import X.C0DK;
import X.C0DV;
import X.C0DW;
import X.C0E6;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0GG;
import X.C0L5;
import X.C0LF;
import X.C0LX;
import X.C0U1;
import X.C0VJ;
import X.C0We;
import X.C0Zn;
import X.C1M7;
import X.C1N6;
import X.C22I;
import X.C2AR;
import X.C2HC;
import X.C2IA;
import X.C2IG;
import X.C2IY;
import X.C2LV;
import X.C2Ln;
import X.C2M2;
import X.C2MG;
import X.C2MS;
import X.C2NE;
import X.C2NF;
import X.C32D;
import X.C40201rk;
import X.C40261rr;
import X.C40411sD;
import X.C41321tj;
import X.C41461tx;
import X.C41471ty;
import X.C41711uO;
import X.C43071wo;
import X.C43081wp;
import X.C43291xA;
import X.C43301xB;
import X.C49462Ko;
import X.C52762bH;
import X.C72763aY;
import X.InterfaceC41261td;
import X.InterfaceC41271te;
import X.InterfaceC453821q;
import X.InterfaceC453921s;
import X.InterfaceC72193Za;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S0101000_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.settings.SettingsJidNotificationActivity;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UnknownFormatConversionException;

/* loaded from: classes2.dex */
public class ContactInfoActivity extends C2IA {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public LinearLayout A07;
    public ListView A08;
    public C018308n A09;
    public C06040Rh A0A;
    public AnonymousClass031 A0B;
    public C018508q A0C;
    public C03230Ew A0D;
    public C02L A0E;
    public C05X A0F;
    public C01B A0G;
    public C018608r A0H;
    public C0E6 A0I;
    public C32D A0J;
    public C2Ln A0K;
    public C06K A0L;
    public C06M A0M;
    public C06L A0N;
    public C49462Ko A0O;
    public C40201rk A0P;
    public C40261rr A0Q;
    public C03320Ff A0R;
    public ChatInfoLayout A0S;
    public C2LV A0T;
    public C2IG A0U;
    public C05W A0V;
    public AnonymousClass008 A0W;
    public AnonymousClass075 A0X;
    public C018708s A0Y;
    public C04630Le A0Z;
    public C0Zn A0a;
    public C0L5 A0b;
    public C0LF A0c;
    public C41321tj A0d;
    public AnonymousClass012 A0e;
    public C001200o A0f;
    public C02F A0g;
    public C002301c A0h;
    public C05Q A0i;
    public C05M A0j;
    public C0DK A0k;
    public C03340Fh A0l;
    public C2NE A0m;
    public C0C8 A0n;
    public C03690Gr A0o;
    public C40411sD A0p;
    public C00A A0q;
    public C43081wp A0r;
    public C06S A0s;
    public C06C A0t;
    public C41711uO A0u;
    public C43071wo A0v;
    public C003701t A0w;
    public AnonymousClass011 A0x;
    public C03360Fk A0y;
    public C018808t A0z;
    public C41461tx A10;
    public C41471ty A11;
    public C05Y A12;
    public C0DW A13;
    public C0DV A14;
    public C22I A15;
    public C04400Ka A16;
    public C0CB A17;
    public C2NF A18;
    public C2AR A19;
    public C2M2 A1A;
    public C2MG A1B;
    public MediaCard A1C;
    public C52762bH A1D;
    public C2MS A1E;
    public C72763aY A1F;
    public C2IY A1G;
    public InterfaceC41271te A1H;
    public InterfaceC41261td A1I;
    public CharSequence A1J;
    public final AbstractView$OnClickListenerC49532Ky A1U = new ViewOnClickCListenerShape8S0100000_I0_0(this, 23);
    public final CompoundButton.OnCheckedChangeListener A1L = new CompoundButton.OnCheckedChangeListener() { // from class: X.2p0
        {
            ContactInfoActivity.this = this;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (z) {
                MuteDialogFragment.A00(contactInfoActivity.A1e()).A14(contactInfoActivity.A0N(), null);
            } else {
                ((ChatInfoActivity) contactInfoActivity).A0J.AS1(new RunnableEBaseShape1S0100000_I0_1(contactInfoActivity, 12));
            }
        }
    };
    public final C0GG A1P = new C0GG() { // from class: X.35S
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.C0GG
        public void A03(AbstractC005302j abstractC005302j) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (contactInfoActivity.A0t == null || abstractC005302j == null || !abstractC005302j.equals(contactInfoActivity.A1e())) {
                return;
            }
            C018508q c018508q = contactInfoActivity.A0C;
            c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(contactInfoActivity, 10));
        }

        @Override // X.C0GG
        public void A05(AbstractC005302j abstractC005302j) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (!abstractC005302j.equals(contactInfoActivity.A1e()) || (!((ActivityC02290Ap) contactInfoActivity).A0M)) {
                return;
            }
            contactInfoActivity.startActivity(new Intent(contactInfoActivity.getApplicationContext(), HomeActivity.class).addFlags(603979776));
        }
    };
    public final C0GA A1O = new C0GA() { // from class: X.35T
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            contactInfoActivity.A1h();
            contactInfoActivity.A0R();
            contactInfoActivity.A1p(true, false);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            UserJid nullable;
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            nullable = UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"));
            if (abstractC005302j.equals(nullable)) {
                contactInfoActivity.A1h();
                return;
            }
            C3AD c3ad = new C3AD(contactInfoActivity.A0V.A0A(abstractC005302j));
            C2LV c2lv = contactInfoActivity.A0T;
            if (c2lv == null || !C06C.A00(c2lv.A00, c3ad)) {
                return;
            }
            contactInfoActivity.A0T.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            UserJid nullable;
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            nullable = UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"));
            if (userJid.equals(nullable)) {
                contactInfoActivity.A1h();
                return;
            }
            C3AC c3ac = new C3AC(contactInfoActivity.A0V.A0A(userJid));
            C2LV c2lv = contactInfoActivity.A0T;
            if (c2lv == null || !C06C.A00(c2lv.A00, c3ac)) {
                return;
            }
            contactInfoActivity.A0T.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            UserJid nullable;
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            nullable = UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"));
            if (userJid.equals(nullable)) {
                contactInfoActivity.A1h();
            }
        }

        @Override // X.C0GA
        public void A05(Collection collection) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            contactInfoActivity.A1g();
            contactInfoActivity.A1j();
        }
    };
    public final C0GC A1N = new C0GC() { // from class: X.35U
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            contactInfoActivity.A1h();
            contactInfoActivity.A0R();
        }

        @Override // X.C0GC
        public void A01(AbstractC005302j abstractC005302j) {
            UserJid nullable;
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            nullable = UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"));
            if (abstractC005302j.equals(nullable)) {
                TextView textView = (TextView) contactInfoActivity.findViewById(R.id.conversation_contact_status);
                String A00 = contactInfoActivity.A0A.A00(contactInfoActivity.A0t);
                textView.setText(A00);
                int i = 0;
                textView.setVisibility(TextUtils.isEmpty(A00) ? 8 : 0);
                View findViewById = contactInfoActivity.A02.findViewById(R.id.business_separator);
                if (contactInfoActivity.A02.getVisibility() == 0 && TextUtils.isEmpty(A00)) {
                    i = 8;
                }
                findViewById.setVisibility(i);
                contactInfoActivity.A1j();
            }
        }
    };
    public final C0GE A1R = new C0GE() { // from class: X.35V
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            contactInfoActivity.A1h();
            contactInfoActivity.A0R();
        }
    };
    public final AbstractC09240cu A1M = new AbstractC09240cu() { // from class: X.35W
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            UserJid nullable;
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            nullable = UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"));
            if (!userJid.equals(nullable) || contactInfoActivity.A01 == null) {
                return;
            }
            contactInfoActivity.A1p(false, false);
        }
    };
    public final C00T A1Q = new C00T() { // from class: X.35X
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            if (anonymousClass092 != null) {
                ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
                if (contactInfoActivity.A1e().equals(anonymousClass092.A0n.A00) && C0DB.A0C(anonymousClass092.A0m)) {
                    if (i == 3 || i == 9) {
                        contactInfoActivity.A1h();
                    }
                }
            }
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            if (collection != null && !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
                    if (contactInfoActivity.A1e().equals(((AnonymousClass092) it.next()).A0n.A00)) {
                        contactInfoActivity.A1h();
                        return;
                    }
                }
            } else if (abstractC005302j == null || ContactInfoActivity.this.A1e().equals(abstractC005302j)) {
                ContactInfoActivity.this.A1h();
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
                if (contactInfoActivity.A1e().equals(anonymousClass092.A0n.A00) && (C0DB.A0C(anonymousClass092.A0m) || anonymousClass092.A0j)) {
                    contactInfoActivity.A1h();
                    return;
                }
            }
        }
    };
    public final InterfaceC453821q A1S = new InterfaceC453821q() { // from class: X.35Y
        {
            ContactInfoActivity.this = this;
        }

        @Override // X.InterfaceC453821q
        public void AOv(AbstractC005302j abstractC005302j) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (abstractC005302j.equals(contactInfoActivity.A1e())) {
                C018508q c018508q = contactInfoActivity.A0C;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(contactInfoActivity, 11));
            }
        }

        @Override // X.InterfaceC453821q
        public void APC(AbstractC005302j abstractC005302j) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (abstractC005302j.equals(contactInfoActivity.A1e())) {
                C018508q c018508q = contactInfoActivity.A0C;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(contactInfoActivity, 12));
            }
        }
    };
    public final InterfaceC453921s A1T = new InterfaceC453921s() { // from class: X.35Z
        @Override // X.InterfaceC453921s
        public void ANe(C0K0 c0k0) {
        }

        {
            ContactInfoActivity.this = this;
        }

        @Override // X.InterfaceC453921s
        public void ANf(AbstractC005302j abstractC005302j, UserJid userJid) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (abstractC005302j.equals(contactInfoActivity.A1e())) {
                C018508q c018508q = contactInfoActivity.A0C;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(contactInfoActivity, 13));
            }
        }

        @Override // X.InterfaceC453921s
        public void ANg(AbstractC005302j abstractC005302j, UserJid userJid) {
            ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
            if (abstractC005302j.equals(contactInfoActivity.A1e())) {
                C018508q c018508q = contactInfoActivity.A0C;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(contactInfoActivity, 14));
            }
        }
    };
    public final Handler A1K = new Handler(Looper.getMainLooper());
    public final Runnable A1V = new RunnableEBaseShape1S0100000_I0_1(this, 13);

    public static Intent A00(UserJid userJid, Context context) {
        Intent intent = new Intent(context, ContactInfoActivity.class);
        intent.putExtra("jid", userJid.getRawString());
        intent.putExtra("circular_transition", true);
        return intent;
    }

    public static void A02(ContactInfoActivity contactInfoActivity, Bitmap bitmap) {
        if (bitmap != null) {
            contactInfoActivity.A1Z(bitmap);
            return;
        }
        boolean A0Y = C003101m.A0Y(contactInfoActivity.A1e());
        int i = R.drawable.avatar_contact_large;
        if (A0Y) {
            i = R.drawable.avatar_server_psa_large;
        }
        contactInfoActivity.A1W(i, R.color.avatar_contact_large);
    }

    public static void A03(C06C c06c, Activity activity, Bundle bundle) {
        Jid A03 = c06c.A03(UserJid.class);
        if (A03 != null) {
            activity.startActivity(A00((UserJid) A03, activity), bundle);
            return;
        }
        throw null;
    }

    public final long A1d() {
        long j = this.A0t.A07;
        if (j == 0) {
            return 60000L;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.A0e.A06(j);
        if (currentTimeMillis < 60000) {
            return 500L;
        }
        return currentTimeMillis < 3600000 ? 5000L : 20000L;
    }

    public UserJid A1e() {
        Jid A03 = this.A0t.A03(UserJid.class);
        if (A03 != null) {
            return (UserJid) A03;
        }
        throw null;
    }

    public void A1f() {
        Cursor query;
        if (this.A0t.A0E()) {
            C04110Ip c04110Ip = new C04110Ip(this.A0f, this.A0V, this.A0h, this.A0L);
            c04110Ip.A08.A01 = C018708s.A02(this.A0t, false);
            c04110Ip.A0A(2, A1e(), C04630Le.A00(this.A0t), "WORK", true);
            Bitmap A01 = this.A0c.A01(this, this.A0t, 96, 0.0f);
            if (A01 != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                    if (A01.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream)) {
                        c04110Ip.A09 = byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    Log.e(e);
                }
            }
            try {
                String A03 = new C43291xA(this.A0h, this.A0B).A03(c04110Ip);
                if (A03 != null) {
                    startActivity(new Intent(this, ContactPicker.class).setType("text/x-vcard").putExtra("android.intent.extra.TEXT", A03));
                    return;
                }
            } catch (C43301xB e2) {
                Log.e(e2);
            }
            this.A0C.A07(R.string.unable_to_share_contact, 0);
            return;
        }
        C06C c06c = this.A0t;
        if (c06c.A08 != null) {
            C05W c05w = this.A0V;
            ContentResolver contentResolver = getContentResolver();
            Uri A04 = c05w.A04(c06c, contentResolver);
            if (A04 != null && (query = contentResolver.query(A04, null, null, null, null)) != null) {
                try {
                    Uri withAppendedPath = query.moveToNext() ? Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, query.getString(query.getColumnIndex("lookup"))) : null;
                    if (withAppendedPath != null) {
                        startActivity(new Intent(this, ContactPicker.class).setType("text/x-vcard").putExtra("android.intent.extra.STREAM", withAppendedPath));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            query.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public final void A1g() {
        if (this.A0t == null) {
            return;
        }
        TextView textView = (TextView) findViewById(R.id.block_contact_text);
        ImageView imageView = (ImageView) findViewById(R.id.block_contact_icon);
        if (this.A0Q.A0H(A1e())) {
            imageView.setColorFilter(C02160Ac.A00(this, R.color.contactInfoFooterUnblock));
            textView.setTextColor(C02160Ac.A00(this, R.color.contactInfoFooterUnblock));
            textView.setText(R.string.unblock);
            return;
        }
        imageView.setColorFilter(C02160Ac.A00(this, R.color.red_button_text));
        textView.setTextColor(C02160Ac.A00(this, R.color.red_button_text));
        textView.setText(R.string.block);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0034, code lost:
        if (r31.A0t.A0E() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x006c, code lost:
        if (r31.A0Y.A0F(r31.A0t) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ea, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1h() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ContactInfoActivity.A1h():void");
    }

    public final void A1i() {
        if (this.A0t == null) {
            return;
        }
        findViewById(R.id.actions_card).setVisibility(0);
        A1b(this.A17.A07(A1e()), C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.mute_layout), this.A1L);
    }

    public final void A1j() {
        ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.ephemeral_msg_view);
        if (this.A0G.A0C() && !this.A0X.A02(A1e())) {
            int A03 = this.A0j.A03(A1e());
            String A0p = AnonymousClass029.A0p(((ActivityC02290Ap) this).A0I, this, A03, false);
            listItemWithRightIcon.setVisibility(0);
            listItemWithRightIcon.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, A03, 2));
            listItemWithRightIcon.setDescription(A0p);
            return;
        }
        listItemWithRightIcon.setVisibility(8);
    }

    public final void A1k() {
        View findViewById = findViewById(R.id.live_location_card);
        if (findViewById != null) {
            View findViewById2 = findViewById(R.id.live_location_info);
            if (findViewById2 != null) {
                TextView textView = (TextView) findViewById2;
                boolean A0h = this.A10.A0h(A1e());
                int size = ((AbstractCollection) this.A10.A0B(A1e())).size();
                if (size == 0 && !A0h) {
                    findViewById.setVisibility(8);
                    return;
                }
                findViewById.setVisibility(0);
                if (A0h && size == 0) {
                    textView.setText(R.string.contact_info_live_location_description_you_are_sharing);
                    return;
                }
                String A0E = this.A0h.A0E(this.A0Y.A08(this.A0t, false));
                if (A0h) {
                    textView.setText(getString(R.string.contact_info_live_location_description_you_and_friend_are_sharing, A0E));
                    return;
                } else {
                    textView.setText(getString(R.string.contact_info_live_location_description_friend_is_sharing, A0E));
                    return;
                }
            }
            throw null;
        }
        throw null;
    }

    public final void A1l() {
        if (this.A0t == null) {
            return;
        }
        findViewById(R.id.notifications_info).setVisibility(this.A17.A07(A1e()).A0H ? 0 : 8);
    }

    public final void A1m() {
        TextView textView = (TextView) findViewById(R.id.status_info);
        long j = this.A0t.A07;
        if (j == 0) {
            textView.setText("");
            return;
        }
        try {
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(this.A0e.A06(j), System.currentTimeMillis(), 0L, 0);
            if (!TextUtils.equals(this.A1J, relativeTimeSpanString)) {
                this.A1J = relativeTimeSpanString;
                textView.setText(relativeTimeSpanString);
            }
        } catch (UnknownFormatConversionException e) {
            Log.e(e);
            textView.setText("");
        }
    }

    public void A1n(C1M7 c1m7) {
        if (this.A0t.A0R) {
            if (!((ChatInfoActivity) this).A0K) {
                Intent intent = new Intent(this, ViewProfilePhoto.class);
                intent.putExtra("jid", A1e().getRawString());
                if (Build.VERSION.SDK_INT >= 21) {
                    intent.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
                }
                startActivity(intent, C2HC.A04(this, this.A06, c1m7.A00(R.string.transition_photo)));
            }
        } else if (C003101m.A0Y(A1e())) {
        } else {
            this.A0C.A07(R.string.no_profile_photo, 0);
            this.A16.A02(A1e(), this.A0t.A02, 2, null);
        }
    }

    public final void A1o(List list) {
        C2LV c2lv = this.A0T;
        c2lv.A00 = list;
        c2lv.notifyDataSetChanged();
        if (this.A0T.getCount() == 0) {
            findViewById(R.id.groups_card).setVisibility(8);
            findViewById(R.id.list_bottom_shadow).setVisibility(8);
            return;
        }
        findViewById(R.id.groups_card).setVisibility(0);
        findViewById(R.id.list_bottom_shadow).setVisibility(0);
        ((TextView) findViewById(R.id.groups_info)).setText(this.A0h.A0G().format(this.A0T.A00.size()));
    }

    public final void A1p(final boolean z, final boolean z2) {
        C0DK c0dk = this.A0k;
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            C06C A02 = c0dk.A02(nullable);
            this.A0t = A02;
            if (!A02.A0B()) {
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(8);
                    this.A1C.setTopShadowVisibility(8);
                    findViewById(R.id.header_bottom_shadow).setVisibility(8);
                    return;
                }
                return;
            }
            if (this.A01 == null) {
                ViewStub viewStub = (ViewStub) this.A05.findViewById(R.id.business_details_card_stub);
                if (((ActivityC02290Ap) this).A0I.A0C(470)) {
                    viewStub.setLayoutResource(R.layout.business_details_card_v3);
                } else {
                    viewStub.setLayoutResource(R.layout.business_details_card);
                }
                View inflate = viewStub.inflate();
                this.A01 = inflate;
                this.A0J = new C32D(this.A0e, this.A0w, this.A1H, this.A0E, this.A1B, this.A0x, this.A1G, this.A0D, this.A09, this.A11, this.A0Y, this.A0h, this.A1I, this.A0X, this.A0N, this.A0K, this.A0L, this.A0O, this.A0P, this, inflate, this.A0t);
                this.A1C.setTopShadowVisibility(0);
                findViewById(R.id.header_bottom_shadow).setVisibility(0);
            }
            final C32D c32d = this.A0J;
            if (c32d == null) {
                return;
            }
            final C06C c06c = this.A0t;
            final AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = this.A1U;
            c32d.A0H.A04(c32d.A00(), new C1N6() { // from class: X.32B
                /* JADX WARN: Code restructure failed: missing block: B:296:0x0051, code lost:
                    if (X.C003101m.A0Y(r9.A00()) != false) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:319:0x00a4, code lost:
                    r5.setVisibility(0);
                    r5 = r9.A0A;
                    r9.A08.setText(r5.A03, new com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1(r9, 2));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:320:0x00be, code lost:
                    if (android.text.TextUtils.isEmpty(r5.A03) != false) goto L45;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:322:0x00c4, code lost:
                    if (r4.A0C(37) == false) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:323:0x00c6, code lost:
                    r9.A08.setTextColor(X.C02160Ac.A00(r9.A0L, com.google.android.search.verification.client.R.color.list_item_info));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:325:0x00d8, code lost:
                    if (r4.A0C(37) != false) goto L214;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:326:0x00da, code lost:
                    r13 = r9.A07;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:327:0x00dc, code lost:
                    if (r13 != null) goto L50;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:328:0x00de, code lost:
                    r2 = (android.view.ViewStub) r1.findViewById(com.google.android.search.verification.client.R.id.business_profile_extra_fields_stub);
                    r2.setLayoutResource(com.google.android.search.verification.client.R.layout.smb_business_profile_extra_fields_card);
                    r13 = new X.C55992mW(r4, r9.A0F, r9.A0D, r9.A0S, r9.A0N, r9.A0P, r9.A0I, r9.A0K, r9.A0L, r2.inflate(), r8, false);
                    r9.A07 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:329:0x0120, code lost:
                    r13.A00(r9.A0A);
                    r2 = 1;
                    r3 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:330:0x0127, code lost:
                    r0 = r9.A0L;
                    r0.populatePhoneNumber(r1);
                    r5 = r9.A0A;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:331:0x0130, code lost:
                    if (r5 == null) goto L213;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:333:0x0138, code lost:
                    if (r9.A0G.A00(r5) == false) goto L213;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:334:0x013a, code lost:
                    r6 = (android.widget.ImageView) r0.findViewById(com.google.android.search.verification.client.R.id.third_action_btn);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:335:0x0145, code lost:
                    if (r6 == null) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:336:0x0147, code lost:
                    r6.setVisibility(r3);
                    r6.setImageResource(com.google.android.search.verification.client.R.drawable.ic_action_view_shop);
                    r6.setContentDescription(r0.getString(com.google.android.search.verification.client.R.string.contact_details_action_icon_shop));
                    r6.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1(r9, 3));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:337:0x0165, code lost:
                    r6 = r9.A0A;
                    r11 = r0.A0N();
                    r0.findViewById(com.google.android.search.verification.client.R.id.shops_container).setVisibility(r3);
                    r0 = r9.A09;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:338:0x0179, code lost:
                    if (r0 == null) goto L212;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:340:0x017f, code lost:
                    if (r0.getVisibility() != 0) goto L212;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:341:0x0181, code lost:
                    r12 = 8;
                    r9.A09.setVisibility(8);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:343:0x0190, code lost:
                    if (r11.A0Q.A01("shops_product_frag") != null) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:344:0x0192, code lost:
                    r5 = r9.A0V;
                    r0 = r6.A05;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:345:0x0196, code lost:
                    if (r0 == null) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:346:0x0198, code lost:
                    r6 = r5.A6x(r0);
                    r5 = new X.C02820Cz(r11);
                    r5.A09(com.google.android.search.verification.client.R.id.shop_product_container, r6, "shops_product_frag", r2);
                    r5.A05();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:348:0x01b0, code lost:
                    if (r4.A0C(470) == false) goto L211;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:349:0x01b2, code lost:
                    r13 = X.C0AT.A0D(r1, com.google.android.search.verification.client.R.id.action_message);
                    r7 = X.C0AT.A0D(r1, com.google.android.search.verification.client.R.id.action_call);
                    r6 = (com.whatsapp.contact.view.custom.ContactDetailsActionIcon) X.C0AT.A0D(r1, com.google.android.search.verification.client.R.id.action_shop);
                    r5 = X.C0AT.A0D(r1, com.google.android.search.verification.client.R.id.action_forward);
                    r4 = r9.A00();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:350:0x01d4, code lost:
                    if (r4 == null) goto L209;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:351:0x01d6, code lost:
                    r13.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1(r9, r4, r2));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:352:0x01e5, code lost:
                    if (r9.A0B.A0B() == false) goto L208;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:354:0x01ed, code lost:
                    if (r9.A0M.A02(r4) == false) goto L208;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:355:0x01ef, code lost:
                    r7 = r9.A0A;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:356:0x01f1, code lost:
                    if (r7 == null) goto L203;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:358:0x01f5, code lost:
                    if (r7.A09 == false) goto L203;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:359:0x01f7, code lost:
                    r6.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1(r9, r4, 2));
                    r6.setVisibility(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:360:0x0202, code lost:
                    r5.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1(r9, 2));
                    r0 = r9.A0A;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:361:0x020c, code lost:
                    if (r0 == null) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:363:0x0214, code lost:
                    if (r0.A0B.isEmpty() != false) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:365:0x021e, code lost:
                    if ((r9.A0I.A01() & 4) <= 0) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:366:0x0220, code lost:
                    r4 = r0.getString(com.google.android.search.verification.client.R.string.business_category_separator_top_card);
                    r5 = (android.widget.TextView) X.C0AT.A0D(r1, com.google.android.search.verification.client.R.id.business_categories);
                    r5.setText(X.C1NH.A00(r9.A0A.A0B, r4), (android.widget.TextView.BufferType) null);
                    r5.setVisibility(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:367:0x0241, code lost:
                    r0 = (android.widget.TextView) X.C0AT.A0D(r1, com.google.android.search.verification.client.R.id.business_hours_status);
                    r0 = r9.A0A;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:368:0x0250, code lost:
                    if (r0 == null) goto L202;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:370:0x0254, code lost:
                    if (r0.A00 == null) goto L202;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:371:0x0256, code lost:
                    r7 = r9.A0P;
                    r0 = r9.A0O.A05();
                    r4 = r9.A0A.A00;
                    r13 = java.util.Calendar.getInstance();
                    r13.setTimeInMillis(r0);
                    r15 = X.C02160Ac.A00(r0, com.google.android.search.verification.client.R.color.business_hours_open);
                    r6 = X.C02160Ac.A00(r0, com.google.android.search.verification.client.R.color.business_hours_closed);
                    r1 = r13.get(7);
                    r14 = new java.util.ArrayList();
                    r5 = r4.A02.iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:373:0x028f, code lost:
                    if (r5.hasNext() == false) goto L104;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:374:0x0291, code lost:
                    r4 = (X.C09490eB) r5.next();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:375:0x0299, code lost:
                    if (r4.A00 != r1) goto L103;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:376:0x029b, code lost:
                    r14.add(r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:377:0x029f, code lost:
                    r17 = new android.text.style.ForegroundColorSpan(r6);
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_today);
                    r6 = new android.text.SpannableString(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:378:0x02b8, code lost:
                    if (r14.isEmpty() != false) goto L152;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:379:0x02ba, code lost:
                    r1 = (X.C09490eB) r14.get(r3);
                    r5 = r1.A00;
                    r0 = r1.A01;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:380:0x02c4, code lost:
                    if (r0 == 0) goto L113;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:381:0x02c6, code lost:
                    if (r0 == r2) goto L112;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:382:0x02c8, code lost:
                    if (r0 != 2) goto L152;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:383:0x02ca, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.open);
                    r1 = new java.lang.Object[r2];
                    r1[0] = r12;
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_appointment_only, r1));
                    r17 = new android.text.style.ForegroundColorSpan(r15);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:384:0x02e9, code lost:
                    r2 = 0;
                    r6.setSpan(r17, 0, r12.length(), 33);
                    r0.setText(r6, android.widget.TextView.BufferType.SPANNABLE);
                    r0.setVisibility(0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:385:0x0301, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.open);
                    r17 = new android.text.style.ForegroundColorSpan(r15);
                    r1 = new java.lang.Object[r2];
                    r1[0] = r12;
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_open_24h, r1));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:386:0x0321, code lost:
                    r4 = r13.get(12) + (r13.get(11) * 60);
                    r0 = r1.A03;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:387:0x0332, code lost:
                    if (r0 == null) goto L150;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:388:0x0334, code lost:
                    r3 = r0.intValue();
                    r0 = r1.A02;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:389:0x033a, code lost:
                    if (r0 == null) goto L148;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:390:0x033c, code lost:
                    r2 = r0.intValue();
                    r16 = X.AnonymousClass088.A15(r13, r5, r3);
                    r1 = X.AnonymousClass088.A15(r13, r5, r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:391:0x034c, code lost:
                    if (r14.size() != 1) goto L125;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:392:0x034e, code lost:
                    if (r4 < r3) goto L122;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:393:0x0350, code lost:
                    if (r4 > r2) goto L122;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:394:0x0352, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.open);
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_open_until, r12, X.AbstractC40621sZ.A03(r7, r1)));
                    r17 = new android.text.style.ForegroundColorSpan(r15);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:395:0x037d, code lost:
                    if (r4 >= r3) goto L124;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:396:0x037f, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now);
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now_opens_at, r12, X.AbstractC40621sZ.A03(r7, r16)));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:397:0x03a5, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now);
                    r6 = new android.text.SpannableString(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:399:0x03b9, code lost:
                    if (r14.size() != 2) goto L152;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:400:0x03bb, code lost:
                    r6 = (X.C09490eB) r14.get(1);
                    r0 = r6.A03;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:401:0x03c3, code lost:
                    if (r0 == null) goto L146;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:402:0x03c5, code lost:
                    r14 = r0.intValue();
                    r0 = r6.A02;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:403:0x03cb, code lost:
                    if (r0 == null) goto L144;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:404:0x03cd, code lost:
                    r0 = r0.intValue();
                    r6 = X.AnonymousClass088.A15(r13, r5, r14);
                    r5 = X.AnonymousClass088.A15(r13, r5, r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:405:0x03d9, code lost:
                    if (r4 < r3) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:406:0x03db, code lost:
                    if (r4 > r2) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:407:0x03dd, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.open);
                    r3 = new java.lang.StringBuilder();
                    r3.append(X.AbstractC40621sZ.A03(r7, r1));
                    r3.append(r0.getString(com.google.android.search.verification.client.R.string.business_hours_separator));
                    r3.append(X.AbstractC40621sZ.A05(r7, r6, r5));
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_open_until, r12, r3));
                    r17 = new android.text.style.ForegroundColorSpan(r15);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:408:0x0421, code lost:
                    if (r4 >= r3) goto L137;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:409:0x0423, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now);
                    r3 = new java.lang.StringBuilder();
                    r3.append(X.AbstractC40621sZ.A03(r7, r16));
                    r3.append(r0.getString(com.google.android.search.verification.client.R.string.business_hours_separator));
                    r3.append(X.AbstractC40621sZ.A05(r7, r6, r5));
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now_opens_at, r12, r3));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:410:0x0462, code lost:
                    if (r4 < r14) goto L140;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:411:0x0464, code lost:
                    if (r4 > r0) goto L140;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:412:0x0466, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.open);
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_open_until, r12, X.AbstractC40621sZ.A03(r7, r5)));
                    r17 = new android.text.style.ForegroundColorSpan(r15);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:413:0x0491, code lost:
                    r12 = r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:414:0x049a, code lost:
                    if (r4 >= r14) goto L143;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:415:0x049c, code lost:
                    r6 = new android.text.SpannableString(r0.getString(com.google.android.search.verification.client.R.string.business_hours_status_closed_now_opens_at, r12, X.AbstractC40621sZ.A03(r7, r6)));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:416:0x04b7, code lost:
                    r6 = new android.text.SpannableString(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:417:0x04be, code lost:
                    r2 = 0;
                    r0.setVisibility(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:419:0x04c6, code lost:
                    if (r9.A05 == null) goto L211;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:421:0x04ca, code lost:
                    if (r9.A04 == null) goto L211;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:422:0x04cc, code lost:
                    r3 = r9.A0N;
                    r1 = r3.A09(r8, r2);
                    r0 = r9.A05;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:423:0x04d4, code lost:
                    if (r1 != null) goto L160;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:424:0x04d6, code lost:
                    r1 = r8.A05();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:425:0x04da, code lost:
                    r0.setText(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:426:0x04e1, code lost:
                    if (r8.A0E() != false) goto L196;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:428:0x04e7, code lost:
                    if (r8.A0F() != false) goto L196;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:429:0x04e9, code lost:
                    r9.A05.setCompoundDrawables(null, null, null, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:430:0x04ef, code lost:
                    r0 = r8.A08;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:431:0x04f1, code lost:
                    if (r0 == null) goto L195;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:433:0x04f9, code lost:
                    if (android.text.TextUtils.isEmpty(r0.A01) != false) goto L195;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:435:0x04ff, code lost:
                    if (r3.A0F(r8) != false) goto L172;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:436:0x0501, code lost:
                    r3 = r9.A04;
                    r1 = X.C000200d.A0P("~");
                    r1.append(r8.A05());
                    r3.A03(r1.toString());
                    r9.A04.setVisibility(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:438:0x0521, code lost:
                    if (r8.A08 == null) goto L201;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:440:0x0527, code lost:
                    if (r3.A0F(r8) != false) goto L201;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:441:0x0529, code lost:
                    r9.A05.setCompoundDrawables(null, null, null, null);
                    r9.A04.A02(com.google.android.search.verification.client.R.drawable.ic_verified);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:442:0x0537, code lost:
                    r9.A04.setCompoundDrawables(null, null, null, null);
                    r9.A05.A02(com.google.android.search.verification.client.R.drawable.ic_verified);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:443:0x0545, code lost:
                    r1 = 8;
                    r9.A04.setVisibility(8);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:444:0x054e, code lost:
                    r9.A04.setText(r9.A0P.A0F(X.C04630Le.A00(r8)));
                    r9.A04.setVisibility(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:445:0x0564, code lost:
                    if (r7 == null) goto L207;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:447:0x056c, code lost:
                    if (r9.A0G.A00(r7) == false) goto L207;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:448:0x056e, code lost:
                    r4 = r0.getString(com.google.android.search.verification.client.R.string.contact_details_action_icon_shop);
                    r6.A00.setImageResource(com.google.android.search.verification.client.R.drawable.ic_action_view_shop);
                    r6.A01.setText(r4);
                    r6.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1(r9, r2));
                    r6.setVisibility(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:449:0x0591, code lost:
                    r6.setVisibility(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:450:0x0596, code lost:
                    r7.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1(r9, r3));
                    r7.setVisibility(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:451:0x05a3, code lost:
                    r12 = 8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:452:0x05a7, code lost:
                    r12 = 8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:453:0x05ab, code lost:
                    r3 = 0;
                    r5 = r9.A0A;
                    r6 = new java.util.ArrayList();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:454:0x05b5, code lost:
                    if (r5.A00 == null) goto L217;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:455:0x05b7, code lost:
                    r6.add(r9.A0L.getString(com.google.android.search.verification.client.R.string.business_details_subtitle_hours));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:457:0x05cb, code lost:
                    if (r5.A01.equals(X.C09510eD.A04) != false) goto L220;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:458:0x05cd, code lost:
                    r6.add(r9.A0L.getString(com.google.android.search.verification.client.R.string.business_details_subtitle_address));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:460:0x05db, code lost:
                    if (r5.A07 == null) goto L223;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:461:0x05dd, code lost:
                    r6.add(r9.A0L.getString(com.google.android.search.verification.client.R.string.business_details_subtitle_category));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:463:0x05eb, code lost:
                    if (r5.A04 == null) goto L226;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:464:0x05ed, code lost:
                    r6.add(r9.A0L.getString(com.google.android.search.verification.client.R.string.business_details_subtitle_email));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:465:0x05f9, code lost:
                    r2 = r5.A0C;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:466:0x05ff, code lost:
                    if (r2.isEmpty() != false) goto L268;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:467:0x0601, code lost:
                    r12 = r2.iterator();
                    r11 = false;
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:469:0x060b, code lost:
                    if (r12.hasNext() == false) goto L253;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:470:0x060d, code lost:
                    r2 = (java.lang.String) r12.next();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:471:0x0617, code lost:
                    if (android.text.TextUtils.isEmpty(r2) != false) goto L252;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:472:0x0619, code lost:
                    r5 = android.net.Uri.parse(X.AnonymousClass088.A0z(r2));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:473:0x062b, code lost:
                    if (r5.getHost().equalsIgnoreCase("www.instagram.com") != false) goto L251;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:475:0x0637, code lost:
                    if (r5.getHost().equalsIgnoreCase("instagram.com") != false) goto L250;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:477:0x0643, code lost:
                    if (r5.getHost().equalsIgnoreCase("instagr.am") != false) goto L249;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:479:0x064f, code lost:
                    if (r5.getHost().equalsIgnoreCase("www.instagr.am") != false) goto L242;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:480:0x0651, code lost:
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:481:0x0654, code lost:
                    r11 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:482:0x0656, code lost:
                    if (r7 <= 0) goto L259;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:483:0x0658, code lost:
                    r5 = r9.A0L;
                    r0 = com.google.android.search.verification.client.R.string.business_details_subtitle_website;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:484:0x065e, code lost:
                    if (r7 <= 1) goto L258;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:485:0x0660, code lost:
                    r0 = com.google.android.search.verification.client.R.string.business_details_subtitle_websites;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:486:0x0663, code lost:
                    r6.add(r5.getString(r0));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:487:0x066a, code lost:
                    if (r11 == false) goto L261;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:488:0x066c, code lost:
                    r6.add(r9.A0L.getString(com.google.android.search.verification.client.R.string.business_details_subtitle_instagram));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:489:0x0678, code lost:
                    r2 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:490:0x067a, code lost:
                    r2 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:491:0x067b, code lost:
                    r5 = X.AnonymousClass029.A0o(r9.A0P, r2, r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:492:0x0683, code lost:
                    if (r9.A01 != null) goto L267;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:494:0x0689, code lost:
                    if (android.text.TextUtils.isEmpty(r5) != false) goto L267;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:495:0x068b, code lost:
                    r2 = (android.view.ViewStub) r1.findViewById(com.google.android.search.verification.client.R.id.other_business_details_stub);
                    r2.setLayoutResource(com.google.android.search.verification.client.R.layout.smb_other_business_details_action_view_layout);
                    r2 = r2.inflate();
                    r9.A01 = r2;
                    ((android.widget.TextView) r2.findViewById(com.google.android.search.verification.client.R.id.other_business_details_info)).setText(r5);
                    r1.findViewById(com.google.android.search.verification.client.R.id.other_business_details_separator).setVisibility(0);
                    r9.A01.setOnClickListener(new com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1(r9, r8, 0));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:496:0x06c0, code lost:
                    r2 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:497:0x06c3, code lost:
                    r9.A08.setIcon(com.google.android.search.verification.client.R.drawable.ic_business_description);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:534:0x0761, code lost:
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:536:0x0763, code lost:
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:538:0x0765, code lost:
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:540:0x0767, code lost:
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:542:0x0769, code lost:
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:544:0x076b, code lost:
                    throw null;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:528:0x0742  */
                /* JADX WARN: Removed duplicated region for block: B:569:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r2v29 */
                /* JADX WARN: Type inference failed for: r2v30, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v31 */
                @Override // X.C1N6
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void AI2(X.C05210Nt r35) {
                    /*
                        Method dump skipped, instructions count: 1906
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C32B.AI2(X.0Nt):void");
                }
            });
            return;
        }
        throw null;
    }

    public final boolean A1q() {
        return !this.A0t.A0B() || ((ActivityC02290Ap) this).A0I.A0C(470);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, android.app.Activity
    public void finishAfterTransition() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A04.setTransitionName(null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A04);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A08);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public /* synthetic */ void lambda$onCreate$1235$ContactInfoActivity(View view) {
        startActivity(new Intent(this, StarredMessagesActivity.class).putExtra("jid", A1e().getRawString()));
    }

    public /* synthetic */ void lambda$onCreate$1237$ContactInfoActivity(View view) {
        startActivityForResult(new Intent(getApplicationContext(), SettingsJidNotificationActivity.class).putExtra("jid", A1e().getRawString()), 12);
    }

    public /* synthetic */ void lambda$onCreate$1238$ContactInfoActivity(View view) {
        A1T();
    }

    public /* synthetic */ void lambda$populatePhoneNumber$1244$ContactInfoActivity(View view) {
        this.A09.A08(this, new Intent(getApplicationContext(), Conversation.class).putExtra("jid", A1e().getRawString()).addFlags(335544320), "ContactInfoActivity");
    }

    public /* synthetic */ void lambda$populatePhoneNumber$1246$ContactInfoActivity(View view) {
        this.A1G.A00(this.A0t, this, 6, true, false);
    }

    public /* synthetic */ void lambda$populatePhoneNumber$1247$ContactInfoActivity(View view) {
        this.A1G.A00(this.A0t, this, 6, true, true);
    }

    public /* synthetic */ void lambda$updatePhones$1254$ContactInfoActivity(View view) {
        this.A1G.A00(this.A0t, this, 6, true, true);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A0d.A06();
            this.A1D.A00();
        } else if (i == 12) {
            A1l();
        } else if (i == 100 && i2 == -1) {
            A1p(false, false);
        }
    }

    @Override // X.C2IA, com.whatsapp.chatinfo.ChatInfoActivity, X.C2IC, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A1D = new C52762bH(this.A0x, this.A0G, ((ActivityC02290Ap) this).A0E, this.A0g);
        this.A1F = new C72763aY(this.A0E, this.A0V, this.A0s, this.A0i);
        if (UserJid.getNullable(getIntent().getStringExtra("jid")) == null) {
            Log.e("contactinfo/on_create: exiting due to null jid");
            finish();
            return;
        }
        A0S();
        setTitle(R.string.contact_info);
        ((ChatInfoActivity) this).A0F.A01 = 2;
        this.A0a = this.A0b.A04(this);
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) getLayoutInflater().inflate(R.layout.contact_info, (ViewGroup) null, false);
        this.A0S = chatInfoLayout;
        setContentView(chatInfoLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.A09();
        A0k(toolbar);
        C0U1 A0c = A0c();
        boolean z = true;
        if (A0c != null) {
            A0c.A0L(true);
        }
        toolbar.setNavigationIcon(new C0We(this.A0h, C02160Ac.A03(this, R.drawable.ic_back_shadow)));
        this.A08 = A1P();
        View inflate = getLayoutInflater().inflate(R.layout.contact_info_header, this.A08, false);
        this.A05 = inflate;
        C0AT.A0V(inflate, 2);
        this.A08.addHeaderView(this.A05, null, false);
        this.A04 = findViewById(R.id.header);
        this.A0S.A01();
        this.A0S.A03(getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        View inflate2 = getLayoutInflater().inflate(R.layout.contact_info_footer, this.A08, false);
        this.A03 = inflate2;
        ListView listView = this.A08;
        FrameLayout frameLayout = new FrameLayout(inflate2.getContext());
        frameLayout.addView(inflate2);
        C0AT.A0V(frameLayout, 2);
        listView.addFooterView(frameLayout, null, false);
        this.A07 = new LinearLayout(this);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        this.A07.setPadding(0, 0, 0, point.y);
        this.A08.addFooterView(this.A07, null, false);
        C0AT.A0V(this.A07, 2);
        this.A06 = (ImageView) findViewById(R.id.picture);
        InterfaceC72193Za interfaceC72193Za = new InterfaceC72193Za() { // from class: X.35G
            {
                ContactInfoActivity.this = this;
            }

            @Override // X.InterfaceC72193Za
            public final void AIa() {
                ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
                Intent intent = new Intent(contactInfoActivity, MediaGalleryActivity.class);
                intent.putExtra("jid", contactInfoActivity.A1e().getRawString());
                contactInfoActivity.startActivity(intent);
            }
        };
        MediaCard mediaCard = (MediaCard) findViewById(R.id.media_card_view);
        this.A1C = mediaCard;
        mediaCard.setSeeMoreClickListener(interfaceC72193Za);
        this.A08.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2oy
            {
                ContactInfoActivity.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
                int i2 = i - 1;
                if (i2 >= 0 && i2 < contactInfoActivity.A0T.getCount()) {
                    C2LV c2lv = contactInfoActivity.A0T;
                    if (!c2lv.A01 && i2 == 10) {
                        c2lv.A01 = true;
                        c2lv.notifyDataSetChanged();
                        return;
                    }
                    contactInfoActivity.A09.A07(contactInfoActivity, Conversation.A00(contactInfoActivity, (C06C) c2lv.A00.get(i2)));
                }
            }
        });
        C1M7 c1m7 = new C1M7(this);
        C2LV c2lv = new C2LV(((ChatInfoActivity) this).A0J, this.A0Y, this.A0h, c1m7, this.A19, this, this.A0a);
        this.A0T = c2lv;
        if (bundle != null) {
            c2lv.A01 = bundle.getBoolean("groups_in_common_list_expanded", false);
        }
        this.A08.setAdapter((ListAdapter) this.A0T);
        A1o(null);
        A1Y(0L);
        findViewById(R.id.starred_messages_layout).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 28));
        A1X(0L);
        findViewById(R.id.payment_transactions_layout).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 18));
        A0m(true);
        C0AT.A0M(findViewById(R.id.groups_in_common));
        A1h();
        A1p(true, bundle != null);
        this.A0S.setOnPhotoClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, c1m7, 0));
        View findViewById = findViewById(R.id.live_location_card);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 19));
            this.A10.A0X(this.A1S);
            this.A10.A0Y(this.A1T);
            A1k();
            A1l();
            findViewById(R.id.notifications_layout).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 30));
            View findViewById2 = findViewById(R.id.media_visibility_layout);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 27));
                A1j();
                A1i();
                View findViewById3 = findViewById(R.id.vcards_layout);
                View findViewById4 = findViewById(R.id.mute_separator);
                if ((this.A0t.A0C() || this.A0t.A0D() || C003101m.A0Y(A1e()) || this.A0t.A08 != null || this.A1F.A00(A1e()).size() <= 0) ? false : false) {
                    findViewById3.setVisibility(0);
                    findViewById4.setVisibility(0);
                    findViewById3.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 22));
                } else {
                    findViewById3.setVisibility(8);
                    findViewById4.setVisibility(8);
                    findViewById3.setOnClickListener(null);
                }
                A1g();
                this.A0q.A01(this.A1Q);
                this.A0W.A01(this.A1O);
                this.A0R.A01(this.A1N);
                this.A0l.A00(this.A1P);
                this.A0M.A01(this.A1M);
                this.A0y.A01(this.A1R);
                View findViewById5 = findViewById(R.id.report_contact_btn);
                if (findViewById5 != null) {
                    findViewById5.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 20));
                    View findViewById6 = findViewById(R.id.block_contact_btn);
                    if (findViewById6 != null) {
                        findViewById6.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.35Q
                            {
                                ContactInfoActivity.this = this;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:26:0x002f, code lost:
                                if (r0.A0B() == false) goto L14;
                             */
                            @Override // X.AbstractView$OnClickListenerC49532Ky
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void A00(android.view.View r10) {
                                /*
                                    r9 = this;
                                    com.whatsapp.chatinfo.ContactInfoActivity r6 = com.whatsapp.chatinfo.ContactInfoActivity.this
                                    X.1rr r1 = r6.A0Q
                                    com.whatsapp.jid.UserJid r0 = r6.A1e()
                                    boolean r0 = r1.A0H(r0)
                                    r7 = 1
                                    if (r0 == 0) goto L17
                                    X.1rr r1 = r6.A0Q
                                    X.06C r0 = r6.A0t
                                    r1.A09(r6, r0, r7)
                                    return
                                L17:
                                    com.whatsapp.jid.UserJid r8 = r6.A1e()
                                    X.01B r1 = r6.A0G
                                    X.03B r0 = X.C01C.A0k
                                    boolean r0 = r1.A0E(r0)
                                    r5 = 0
                                    if (r0 == 0) goto L31
                                    X.06C r0 = r6.A0t
                                    if (r0 == 0) goto L31
                                    boolean r0 = r0.A0B()
                                    r4 = 1
                                    if (r0 != 0) goto L32
                                L31:
                                    r4 = 0
                                L32:
                                    com.whatsapp.blocklist.BlockConfirmationDialogFragment r3 = new com.whatsapp.blocklist.BlockConfirmationDialogFragment
                                    r3.<init>()
                                    android.os.Bundle r2 = new android.os.Bundle
                                    r2.<init>()
                                    java.lang.String r1 = r8.getRawString()
                                    java.lang.String r0 = "jid"
                                    r2.putString(r0, r1)
                                    java.lang.String r1 = "entryPoint"
                                    java.lang.String r0 = "account_info"
                                    r2.putString(r1, r0)
                                    java.lang.String r0 = "fromSpamPanel"
                                    r2.putBoolean(r0, r5)
                                    java.lang.String r0 = "showBlockReasons"
                                    r2.putBoolean(r0, r4)
                                    java.lang.String r0 = "showSuccessToast"
                                    r2.putBoolean(r0, r7)
                                    java.lang.String r0 = "showReportAndBlock"
                                    r2.putBoolean(r0, r5)
                                    r3.A0P(r2)
                                    r6.AUh(r3)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C35Q.A00(android.view.View):void");
                            }
                        });
                        if (C003101m.A0Y(A1e())) {
                            findViewById(R.id.block_contact_card).setVisibility(8);
                            findViewById(R.id.report_contact_card).setVisibility(8);
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            if (getIntent().getBooleanExtra("circular_transition", false)) {
                                this.A04.setTransitionName(c1m7.A00(R.string.transition_photo));
                            } else {
                                findViewById(R.id.picture).setTransitionName(c1m7.A00(R.string.transition_photo));
                            }
                        }
                        ((ChatInfoActivity) this).A0J.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 10));
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

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0t != null) {
            if (C003101m.A0Y(A1e())) {
                return super.onCreateOptionsMenu(menu);
            }
            C06C c06c = this.A0t;
            if (c06c.A08 != null || c06c.A0E()) {
                menu.add(0, 7, 0, R.string.share_contact);
            }
            if (this.A0t.A08 != null) {
                menu.add(0, 6, 0, R.string.edit_contact_in_address_book);
                menu.add(0, 1, 0, R.string.view_contact_in_address_book);
            } else {
                menu.add(0, 3, 0, R.string.add_contact);
            }
            menu.add(0, 5, 0, R.string.verify_identity);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        CatalogMediaCard catalogMediaCard;
        super.onDestroy();
        this.A10.A0X.remove(this.A1S);
        this.A10.A0Y.remove(this.A1T);
        this.A0W.A00(this.A1O);
        this.A0R.A00(this.A1N);
        this.A0l.A01(this.A1P);
        this.A0M.A00(this.A1M);
        this.A0y.A00(this.A1R);
        this.A0q.A00(this.A1Q);
        this.A0a.A00();
        this.A1K.removeCallbacks(this.A1V);
        this.A06.setImageDrawable(null);
        C32D c32d = this.A0J;
        if (c32d != null && (catalogMediaCard = c32d.A09) != null) {
            catalogMediaCard.A07.A00();
            catalogMediaCard.A09.A00(catalogMediaCard.A0J);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri A04;
        Uri A042;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C06C c06c = this.A0t;
            if (c06c.A08 != null && (A04 = this.A0V.A04(c06c, getContentResolver())) != null) {
                this.A0t.A08.toString();
                Intent intent = new Intent("android.intent.action.VIEW", A04);
                intent.setComponent(intent.resolveActivity(getPackageManager()));
                if (intent.getComponent() != null) {
                    startActivity(intent);
                } else {
                    Log.w("contactinfo/opt system contact list could not found");
                    this.A0C.A07(R.string.unimplemented, 0);
                    return true;
                }
            }
            return true;
        } else if (itemId == 3) {
            try {
                startActivityForResult(this.A1E.A01(this.A0t, A1e(), false), 10);
                this.A1D.A02(false, 2);
                return true;
            } catch (ActivityNotFoundException unused) {
                this.A0C.A07(R.string.group_add_contact_failed, 0);
                return true;
            }
        } else if (itemId != 16908332) {
            switch (itemId) {
                case 5:
                    Intent intent2 = new Intent(this, IdentityVerificationActivity.class);
                    intent2.putExtra("jid", A1e().getRawString());
                    startActivity(intent2);
                    return true;
                case 6:
                    C06C c06c2 = this.A0t;
                    if (c06c2.A08 != null && (A042 = this.A0V.A04(c06c2, getContentResolver())) != null) {
                        this.A0t.A08.toString();
                        Intent intent3 = new Intent("android.intent.action.EDIT", A042);
                        intent3.setComponent(intent3.resolveActivity(getPackageManager()));
                        if (intent3.getComponent() != null) {
                            startActivity(intent3);
                        } else {
                            Log.w("contactinfo/opt system contact list could not found");
                            this.A0C.A07(R.string.unimplemented, 0);
                            return true;
                        }
                    }
                    return true;
                case 7:
                    A1f();
                    return true;
                case 8:
                case 9:
                    return true;
                default:
                    return false;
            }
        } else {
            C0VJ.A0B(this);
            return true;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A15.A07(A1e());
        C32D c32d = this.A0J;
        if (c32d == null || c32d.A00() == null) {
            return;
        }
        C32D c32d2 = this.A0J;
        c32d2.A01(c32d2.A00(), true);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("groups_in_common_list_expanded", this.A0T.A01);
    }

    public void populatePhoneNumber(View view) {
        View findViewById = view.findViewById(R.id.phone_container);
        if (findViewById == null) {
            return;
        }
        if (findViewById.getVisibility() != 0) {
            findViewById.setVisibility(0);
        }
        TextView textView = (TextView) findViewById.findViewById(R.id.title_tv);
        View findViewById2 = findViewById.findViewById(R.id.primary_action_btn);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.subtitle_tv);
        View findViewById3 = findViewById.findViewById(R.id.primary_action_icon);
        View findViewById4 = findViewById.findViewById(R.id.secondary_action_btn);
        View findViewById5 = findViewById.findViewById(R.id.third_action_btn);
        C0LX.A03(textView);
        final String A00 = C04630Le.A00(this.A0t);
        textView.setText(A00);
        CharSequence A01 = C018708s.A01(this.A0h, this.A0t);
        textView2.setText(A01);
        textView2.setVisibility(TextUtils.isEmpty(A01) ? 8 : 0);
        ViewOnClickEBaseShape0S0100000_I0_0 viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 33);
        findViewById3.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_0);
        findViewById2.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_0);
        findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2p1
            {
                ContactInfoActivity.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                ContactInfoActivity contactInfoActivity = ContactInfoActivity.this;
                String str = A00;
                ClipboardManager A06 = ((ActivityC02290Ap) contactInfoActivity).A0E.A06();
                if (A06 != null) {
                    A06.setPrimaryClip(ClipData.newPlainText(str, str));
                    contactInfoActivity.A0C.A07(R.string.phone_copied, 0);
                    return true;
                }
                return true;
            }
        });
        if (this.A0t.A0B() && this.A0X.A02(A1e())) {
            findViewById4.setVisibility(8);
            findViewById5.setVisibility(8);
            return;
        }
        findViewById4.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 31));
        findViewById5.setVisibility(0);
        findViewById5.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 29));
    }
}
