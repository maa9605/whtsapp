package com.whatsapp.chatinfo;

import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.AnonymousClass029;
import X.AnonymousClass094;
import X.AnonymousClass097;
import X.AnonymousClass272;
import X.AnonymousClass317;
import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C003701t;
import X.C018308n;
import X.C018608r;
import X.C018808t;
import X.C019208x;
import X.C019308y;
import X.C02160Ac;
import X.C02180Ae;
import X.C02F;
import X.C02L;
import X.C03300Fd;
import X.C03690Gr;
import X.C05M;
import X.C05W;
import X.C06C;
import X.C0C9;
import X.C0HS;
import X.C0LD;
import X.C14100mP;
import X.C14130mS;
import X.C14140mT;
import X.C14150mU;
import X.C1M4;
import X.C1M6;
import X.C1M7;
import X.C2HC;
import X.C2IC;
import X.C2IG;
import X.C2JE;
import X.C2MZ;
import X.C2NE;
import X.C35P;
import X.C40071rX;
import X.C40081rY;
import X.C40411sD;
import X.C40841sx;
import X.C42471vn;
import X.C49222Jd;
import X.C49462Ko;
import X.C68303Iz;
import X.InterfaceC002901k;
import X.InterfaceC14120mR;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment;
import com.whatsapp.conversation.ChatMediaEphemeralVisibilityDialog;
import com.whatsapp.conversation.ChatMediaVisibilityDialog;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.ui.media.MediaCard;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class ChatInfoActivity extends C2IC {
    public int A00;
    public int A01;
    public C02L A02;
    public C018608r A03;
    public C49462Ko A04;
    public AnonymousClass272 A05;
    public C35P A06;
    public C05W A07;
    public C02F A08;
    public C002301c A09;
    public C05M A0A;
    public C0C9 A0B;
    public C2NE A0C;
    public C03690Gr A0D;
    public C40411sD A0E;
    public C03300Fd A0F;
    public AnonymousClass097 A0G;
    public C2MZ A0H;
    public C42471vn A0I;
    public InterfaceC002901k A0J;
    public boolean A0K;
    public final HashSet A0L = new HashSet();

    public AbstractC005302j A1R() {
        if (this instanceof GroupChatInfo) {
            return ((GroupChatInfo) this).A1d();
        }
        if (!(this instanceof ListChatInfo)) {
            return ((ContactInfoActivity) this).A1e();
        }
        return ((ListChatInfo) this).A1d();
    }

    public void A1S() {
        if (this instanceof GroupChatInfo) {
            GroupChatInfo groupChatInfo = (GroupChatInfo) this;
            groupChatInfo.A1V();
            C49222Jd c49222Jd = groupChatInfo.A0v;
            if (c49222Jd != null) {
                c49222Jd.A05(true);
                groupChatInfo.A0v = null;
            }
            C0HS c0hs = groupChatInfo.A1M;
            if (c0hs != null) {
                c0hs.A05(true);
                groupChatInfo.A0v = null;
            }
        } else if (this instanceof ListChatInfo) {
            ListChatInfo listChatInfo = (ListChatInfo) this;
            listChatInfo.A1V();
            C68303Iz c68303Iz = listChatInfo.A0B;
            if (c68303Iz != null) {
                c68303Iz.A05(true);
                listChatInfo.A0B = null;
            }
        } else if (!(this instanceof ContactInfoActivity)) {
            A1V();
        } else {
            ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this;
            contactInfoActivity.A1V();
            C2IG c2ig = contactInfoActivity.A0U;
            if (c2ig != null) {
                c2ig.A05(true);
                contactInfoActivity.A0U = null;
            }
        }
    }

    public void A1T() {
        DialogFragment chatMediaVisibilityDialog;
        AbstractC005302j A1R = A1R();
        C003701t c003701t = ((ActivityC02290Ap) this).A0I;
        C05M c05m = this.A0A;
        C05W c05w = this.A07;
        if (A1R != null && c003701t.A0C(382) && AnonymousClass029.A05(c05m, c05w, A1R) > 0) {
            chatMediaVisibilityDialog = new ChatMediaEphemeralVisibilityDialog();
        } else if (A1R != null) {
            chatMediaVisibilityDialog = new ChatMediaVisibilityDialog();
            Bundle bundle = new Bundle();
            bundle.putString("chatJid", A1R.getRawString());
            chatMediaVisibilityDialog.A0P(bundle);
        } else {
            throw null;
        }
        AUh(chatMediaVisibilityDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.35P, X.0HS] */
    public void A1U() {
        A1V();
        C002301c c002301c = this.A09;
        C03690Gr c03690Gr = this.A0D;
        C40411sD c40411sD = this.A0E;
        C2NE c2ne = this.A0C;
        MediaCard mediaCard = (MediaCard) findViewById(R.id.media_card_view);
        AbstractC005302j A1R = A1R();
        if (A1R != null) {
            ?? r2 = new C0HS(c002301c, c03690Gr, c40411sD, c2ne, mediaCard, A1R) { // from class: X.35P
                public final C0HE A00 = new C0HE();
                public final C002301c A01;
                public final C2NE A02;
                public final C03690Gr A03;
                public final C40411sD A04;
                public final AbstractC005302j A05;
                public final WeakReference A06;

                {
                    this.A01 = c002301c;
                    this.A03 = c03690Gr;
                    this.A04 = c40411sD;
                    this.A02 = c2ne;
                    this.A06 = new WeakReference(mediaCard);
                    this.A05 = A1R;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    C40411sD c40411sD2 = this.A04;
                    AbstractC005302j abstractC005302j = this.A05;
                    int A01 = c40411sD2.A01(abstractC005302j, new C0HB() { // from class: X.35B
                        {
                            C35P.this = this;
                        }

                        @Override // X.C0HB
                        public final boolean AUW() {
                            return A04();
                        }
                    }, Integer.MAX_VALUE);
                    C03690Gr c03690Gr2 = this.A03;
                    C0HE c0he = this.A00;
                    return Integer.valueOf(this.A02.A00(abstractC005302j, c0he) + c03690Gr2.A02(abstractC005302j, c0he) + A01);
                }

                @Override // X.C0HS
                public void A08() {
                    this.A00.A01();
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    MediaCard mediaCard2 = (MediaCard) this.A06.get();
                    if (mediaCard2 != null) {
                        mediaCard2.setMediaInfo(this.A01.A0G().format(obj));
                    }
                }
            };
            this.A06 = r2;
            this.A0J.ARy(r2, new Void[0]);
            return;
        }
        throw null;
    }

    public void A1V() {
        C35P c35p = this.A06;
        if (c35p != null) {
            c35p.A05(true);
            this.A06 = null;
        }
    }

    public void A1W(int i, int i2) {
        float abs;
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) findViewById(R.id.content);
        chatInfoLayout.findViewById(R.id.photo_progress).setVisibility(8);
        ((ImageView) chatInfoLayout.findViewById(R.id.picture)).setImageResource(i);
        int A00 = C02160Ac.A00(this, i2);
        this.A00 = A00;
        chatInfoLayout.setColor(A00);
        findViewById(R.id.bottom_shade).setBackgroundColor(0);
        findViewById(R.id.top_shade).setBackgroundColor(0);
        if (Build.VERSION.SDK_INT >= 21) {
            float[] fArr = new float[3];
            int i3 = this.A00;
            float red = Color.red(i3) / 255.0f;
            float green = Color.green(i3) / 255.0f;
            float blue = Color.blue(i3) / 255.0f;
            float max = Math.max(red, Math.max(green, blue));
            float min = Math.min(red, Math.min(green, blue));
            float f = max - min;
            float f2 = (max + min) / 2.0f;
            float f3 = 0.0f;
            if (max == min) {
                abs = 0.0f;
            } else {
                if (max == red) {
                    f3 = ((green - blue) / f) % 6.0f;
                } else {
                    f3 = max == green ? ((blue - red) / f) + 2.0f : ((red - green) / f) + 4.0f;
                }
                abs = f / (1.0f - Math.abs((2.0f * f2) - 1.0f));
            }
            fArr[0] = (f3 * 60.0f) % 360.0f;
            fArr[1] = abs;
            fArr[2] = f2;
            fArr[2] = (f2 * 8.0f) / 10.0f;
            this.A01 = C02180Ae.A08(fArr);
            getWindow().setStatusBarColor(this.A01);
        }
    }

    public void A1X(long j) {
        View findViewById = findViewById(R.id.payment_transactions_layout);
        View findViewById2 = findViewById(R.id.payment_transactions_separator);
        if (j == 0) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        ((TextView) findViewById(R.id.payment_transactions_count)).setText(this.A09.A0G().format(j));
    }

    public void A1Y(long j) {
        View findViewById = findViewById(R.id.starred_messages_layout);
        View findViewById2 = findViewById(R.id.starred_messages_separator);
        if (j == 0) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        ((TextView) findViewById(R.id.starred_messages_count)).setText(this.A09.A0G().format(j));
    }

    public void A1Z(Bitmap bitmap) {
        View findViewById = findViewById(R.id.content);
        findViewById.findViewById(R.id.photo_progress).setVisibility(8);
        final C14100mP c14100mP = new C14100mP(bitmap);
        final InterfaceC14120mR interfaceC14120mR = new InterfaceC14120mR() { // from class: X.35L
            {
                ChatInfoActivity.this = this;
            }

            @Override // X.InterfaceC14120mR
            public final void AKh(C14140mT c14140mT) {
                ChatInfoActivity.this.A1a(c14140mT);
            }
        };
        new AsyncTask() { // from class: X.0mO
            @Override // android.os.AsyncTask
            public Object doInBackground(Object[] objArr) {
                try {
                    return c14100mP.A00();
                } catch (Exception e) {
                    Log.e("Palette", "Exception thrown during async generate", e);
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Object obj) {
                interfaceC14120mR.AKh((C14140mT) obj);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c14100mP.A04);
        ((ImageView) findViewById.findViewById(R.id.picture)).setImageBitmap(bitmap);
    }

    public final void A1a(C14140mT c14140mT) {
        C14130mS c14130mS;
        int i;
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) findViewById(R.id.content);
        if (!AnonymousClass029.A1K(this) && c14140mT != null) {
            c14130mS = (C14130mS) c14140mT.A04.get(C14150mU.A08);
        } else {
            c14130mS = null;
        }
        if (c14130mS != null) {
            i = c14130mS.A08;
            chatInfoLayout.setColor(i);
            this.A00 = i;
            if (Build.VERSION.SDK_INT >= 21) {
                float[] A01 = c14130mS.A01();
                A01[2] = (A01[2] * 8.0f) / 10.0f;
                this.A01 = C02180Ae.A08(A01);
                getWindow().setStatusBarColor(this.A01);
            }
        } else {
            chatInfoLayout.setColor(C02160Ac.A00(this, R.color.primary));
            this.A00 = C02160Ac.A00(this, R.color.primary);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01 = C02160Ac.A00(this, R.color.primary_dark);
                getWindow().setStatusBarColor(this.A01);
            }
            i = 0;
        }
        int i2 = 16777215 & i;
        findViewById(R.id.bottom_shade).setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, i2}));
        findViewById(R.id.top_shade).setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{855638016, i2}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0071, code lost:
        if (r14.A09() != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1b(X.C03370Fl r14, android.view.View r15, android.widget.CompoundButton.OnCheckedChangeListener r16) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatInfoActivity.A1b(X.0Fl, android.view.View, android.widget.CompoundButton$OnCheckedChangeListener):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00c0, code lost:
        if (r8 != 29) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1c(java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatInfoActivity.A1c(java.util.ArrayList):void");
    }

    @Override // android.app.Activity
    public void finishAfterTransition() {
        A1S();
        super.finishAfterTransition();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 34 && i2 == -1) {
            viewMedia(null);
        }
    }

    @Override // X.C2IC, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        AnonymousClass094 A03;
        if (C2HC.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                C1M4 c1m4 = new C1M4(true, false);
                c1m4.addTarget(getApplicationContext().getResources().getString(R.string.transition_photo));
                window.setSharedElementEnterTransition(c1m4);
                c1m4.addListener(new C1M6() { // from class: X.35M
                    {
                        ChatInfoActivity.this = this;
                    }

                    @Override // X.C1M6, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        ChatInfoActivity.this.A0K = false;
                    }

                    @Override // X.C1M6, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        ChatInfoActivity.this.A0K = true;
                    }
                });
            }
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.clearFlags(67108864);
        }
        A0h(5);
        super.onCreate(bundle);
        if (bundle == null || (A03 = C0LD.A03(bundle, "requested_message")) == null) {
            return;
        }
        this.A0G = (AnonymousClass097) this.A0B.A0H.A05(A03);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        A1S();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            A1S();
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass097 anonymousClass097 = this.A0G;
        if (anonymousClass097 != null) {
            C0LD.A07(bundle, anonymousClass097.A0n, "requested_message");
        }
    }

    public final void viewMedia(View view) {
        if (this.A0G == null) {
            return;
        }
        AnonymousClass317 A09 = C40841sx.A09(this);
        AbstractC005302j A1R = A1R();
        if (A1R != null) {
            A09.A03 = A1R;
            A09.A04 = this.A0G.A0n;
            A09.A02 = view;
            Intent A00 = A09.A00();
            if (view != null) {
                C2HC.A06(this, new C1M7(this), A00, view, C2JE.A08(this.A0G));
                return;
            } else {
                startActivity(A00);
                return;
            }
        }
        throw null;
    }

    /* loaded from: classes2.dex */
    public class EncryptionExplanationDialogFragment extends Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment {
        public C018308n A00;
        public C05W A01;
        public C40081rY A02;
        public C018808t A03;
        public C40071rX A04;

        public static EncryptionExplanationDialogFragment A00(AbstractC005302j abstractC005302j, int i, String str, boolean z) {
            EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = new EncryptionExplanationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", abstractC005302j.getRawString());
            bundle.putInt("provider_category", i);
            bundle.putString("display_name", str);
            bundle.putBoolean("is_in_app_support", z);
            encryptionExplanationDialogFragment.A0P(bundle);
            return encryptionExplanationDialogFragment;
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String string;
            Bundle A02 = A02();
            String string2 = A02.getString("jid");
            final int i = A02.getInt("provider_category", 0);
            String string3 = A02.getString("display_name");
            final boolean z = A02.getBoolean("is_in_app_support");
            C05W c05w = this.A01;
            AbstractC005302j A022 = AbstractC005302j.A02(string2);
            C000700j.A04(A022, string2);
            final C06C A0A = c05w.A0A(A022);
            C018808t c018808t = this.A03;
            ActivityC02330At A09 = A09();
            Jid A023 = A0A.A02();
            if (c018808t.A02(A023)) {
                string = A09.getString(R.string.contact_info_security_modal_in_app_support);
            } else if (i == 1) {
                string = A09.getString(R.string.encryption_description);
            } else if (i != 2) {
                if (i != 3 && i != 4) {
                    C000200d.A0p("providerCategoryToModal unexpected argument value for providerCategory: ", i);
                    string = A09.getString(R.string.encryption_description);
                } else if (string3 != null) {
                    if (C003101m.A0S(A023)) {
                        string = A09.getString(R.string.contact_info_security_modal_company_number, string3);
                    } else {
                        string = A09.getString(R.string.contact_info_security_modal_fb_and_bsp, string3, string3);
                    }
                } else {
                    throw null;
                }
            } else if (string3 != null) {
                string = A09.getString(R.string.contact_info_security_modal_bsp, string3, string3);
            } else {
                throw null;
            }
            C019208x c019208x = new C019208x(A09());
            CharSequence A0g = C002701i.A0g(string, A09(), this.A02);
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = A0g;
            c019308y.A0J = true;
            c019208x.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2ow
                {
                    ChatInfoActivity.EncryptionExplanationDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ChatInfoActivity.EncryptionExplanationDialogFragment.this.A10();
                }
            });
            c019208x.A05(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.2ov
                {
                    ChatInfoActivity.EncryptionExplanationDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Uri A024;
                    ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = ChatInfoActivity.EncryptionExplanationDialogFragment.this;
                    boolean z2 = z;
                    int i3 = i;
                    if (z2) {
                        A024 = encryptionExplanationDialogFragment.A04.A03("general", "about-safely-communicating-with-whatsapp-support", null);
                    } else if (i3 == 1) {
                        A024 = encryptionExplanationDialogFragment.A04.A03("general", "28030015", null);
                    } else {
                        A024 = encryptionExplanationDialogFragment.A04.A02("security-and-privacy", "end-to-end-encryption-for-business-messages");
                    }
                    encryptionExplanationDialogFragment.A00.A06(((Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment) encryptionExplanationDialogFragment).A00, new Intent("android.intent.action.VIEW", A024));
                    encryptionExplanationDialogFragment.A10();
                }
            });
            if (!A0A.A0C() && !A0A.A0D() && !z && i == 1) {
                c019208x.A06(R.string.identity_change_verify, new DialogInterface.OnClickListener() { // from class: X.2ou
                    {
                        ChatInfoActivity.EncryptionExplanationDialogFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = ChatInfoActivity.EncryptionExplanationDialogFragment.this;
                        C06C c06c = A0A;
                        Intent intent = new Intent(((Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment) encryptionExplanationDialogFragment).A00, IdentityVerificationActivity.class);
                        Jid A024 = c06c.A02();
                        if (A024 != null) {
                            intent.putExtra("jid", A024.getRawString());
                            encryptionExplanationDialogFragment.A0i(intent);
                            return;
                        }
                        throw null;
                    }
                });
            }
            return c019208x.A00();
        }
    }
}
