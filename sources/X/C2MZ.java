package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;

/* renamed from: X.2MZ */
/* loaded from: classes2.dex */
public class C2MZ {
    public static volatile C2MZ A08;
    public final C018508q A00;
    public final C000500h A01;
    public final C43081wp A02;
    public final C41711uO A03;
    public final C40081rY A04;
    public final C003701t A05;
    public final C0EE A06;
    public final InterfaceC002901k A07;

    public C2MZ(C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C0EE c0ee, C43081wp c43081wp, C000500h c000500h, C41711uO c41711uO) {
        this.A05 = c003701t;
        this.A00 = c018508q;
        this.A07 = interfaceC002901k;
        this.A04 = c40081rY;
        this.A06 = c0ee;
        this.A02 = c43081wp;
        this.A01 = c000500h;
        this.A03 = c41711uO;
    }

    public static final String A00(Context context, int i) {
        return i == -1 ? context.getString(R.string.delete_all_media) : context.getResources().getQuantityString(R.plurals.delete_medias, i, Integer.valueOf(i));
    }

    public C019208x A01(Context context, InterfaceC53622hF interfaceC53622hF, int i, String str) {
        if (A08()) {
            return A04(context, new C53632hG(interfaceC53622hF), 1, i, 0, false);
        }
        return A03(context, interfaceC53622hF, str, false, R.string.delete, 1);
    }

    public C019208x A02(Context context, InterfaceC53622hF interfaceC53622hF, int i, String str) {
        if (A08()) {
            return A04(context, new C53632hG(interfaceC53622hF), 1, i, 2, false);
        }
        return A03(context, interfaceC53622hF, str, true, R.string.delete, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r11 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C019208x A03(android.content.Context r13, final X.InterfaceC53622hF r14, java.lang.String r15, final boolean r16, int r17, int r18) {
        /*
            r12 = this;
            r5 = 2131886560(0x7f1201e0, float:1.9407702E38)
            r7 = r12
            X.00h r0 = r12.A01
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "pref_media_delete_per_conversation"
            r4 = 0
            boolean r11 = r1.getBoolean(r0, r4)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            r1 = 2131558724(0x7f0d0144, float:1.8742772E38)
            r0 = 0
            android.view.View r3 = r2.inflate(r1, r0)
            r0 = 2131362662(0x7f0a0366, float:1.834511E38)
            android.view.View r8 = r3.findViewById(r0)
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            r0 = r18
            java.lang.String r0 = A00(r13, r0)
            r8.setText(r0)
            r6 = 1
            r10 = r16
            if (r16 == 0) goto L35
            r0 = 0
            if (r11 == 0) goto L36
        L35:
            r0 = 1
        L36:
            r8.setChecked(r0)
            X.08x r2 = new X.08x
            r2.<init>(r13)
            android.content.Context r1 = r13.getApplicationContext()
            X.1rY r0 = r12.A04
            java.lang.CharSequence r0 = X.C002701i.A0g(r15, r1, r0)
            X.08y r1 = r2.A01
            r1.A0E = r0
            r1.A0J = r6
            r9 = r14
            X.3Zo r0 = new X.3Zo
            r0.<init>()
            r2.A04(r5, r0)
            X.3Zl r6 = new X.3Zl
            r6.<init>()
            r0 = r17
            r2.A06(r0, r6)
            r1.A0C = r3
            r1.A01 = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2MZ.A03(android.content.Context, X.2hF, java.lang.String, boolean, int, int):X.08x");
    }

    public C019208x A04(Context context, final InterfaceC53642hH interfaceC53642hH, int i, int i2, final int i3, boolean z) {
        boolean z2;
        String string;
        String string2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_clear_messages, (ViewGroup) null);
        View A0D = C0AT.A0D(inflate, R.id.delete_media_container);
        View A0D2 = C0AT.A0D(inflate, R.id.delete_starred_container);
        final CheckBox checkBox = (CheckBox) C0AT.A0D(inflate, R.id.delete_media_checkbox);
        TextView textView = (TextView) C0AT.A0D(inflate, R.id.delete_media_checkbox_text);
        final TextView textView2 = (TextView) C0AT.A0D(inflate, R.id.clear_messages_dialog_message);
        textView2.setText(R.string.delete_chat_clear_chat_dialog_message);
        textView2.setVisibility(8);
        final boolean z3 = this.A01.A00.getBoolean("pref_media_delete_per_conversation", false);
        final CheckBox checkBox2 = (CheckBox) C0AT.A0D(inflate, R.id.delete_starred_checkbox);
        if (i3 == 0) {
            z2 = true;
        } else if (i3 == 1) {
            z2 = false;
        } else if (i3 != 2) {
            throw new IllegalArgumentException(C000200d.A0D("DeleteMessagesDialogUtil/getAlertBuilderV2 mediaCheckBoxState = ", i3));
        } else {
            z2 = z3;
        }
        checkBox.setChecked(z2);
        textView.setText(A00(context, i));
        A0D2.setVisibility(z ? 0 : 8);
        if (this.A06.A02()) {
            this.A07.ARy(new C0HS() { // from class: X.2hI
                {
                    C2MZ.this = this;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    return Boolean.valueOf(C2MZ.this.A03.A0E());
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    textView2.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                }
            }, new Void[0]);
        }
        A0D.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(checkBox, 4));
        A0D2.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(checkBox2, 3));
        if (i2 == 0) {
            string = i == -1 ? context.getString(R.string.delete_all_chats_title) : context.getResources().getQuantityString(R.plurals.delete_chats_title, i, Integer.valueOf(i));
        } else if (i2 == 1) {
            C000700j.A0A(i == 1, "Use DELETE_SINGLE_BROADCAST_LIST only for single broadcast deletion");
            string = context.getString(R.string.delete_broadcast_list_title);
        } else if (i2 != 2) {
            if (i2 == 3) {
                string = i == -1 ? context.getString(R.string.clear_all_chats_title) : context.getString(R.string.clear_this_chat_title);
            } else {
                throw new IllegalArgumentException(C000200d.A0D("DeleteMessagesDialogUtil/getTitleText dialogType = ", i2));
            }
        } else {
            C000700j.A0A(i == 1, "Use DELETE_SINGLE_GROUP_CHAT only for single broadcast deletion");
            string = context.getString(R.string.delete_group_title);
        }
        C019208x c019208x = new C019208x(context);
        c019208x.A01.A0I = string;
        c019208x.A07(inflate);
        if (i2 == 0) {
            string2 = (i == -1 || i > 1) ? context.getString(R.string.delete_multiple_chats_button_text) : context.getString(R.string.delete_single_chat_button_text);
        } else if (i2 == 1) {
            C000700j.A08(i == 1, "Use DELETE_BROADCAST_LIST only for single broadcast deletion");
            string2 = context.getString(R.string.delete_broadcast_button_text);
        } else if (i2 != 2) {
            if (i2 == 3) {
                string2 = (i == -1 || i > 1) ? context.getString(R.string.clear_multiple_chats_button_text) : context.getString(R.string.clear_single_chat_button_text);
            } else {
                throw new IllegalArgumentException(C000200d.A0D("DeleteMessagesDialogUtil/getPositiveButtonText dialogType = ", i2));
            }
        } else {
            C000700j.A08(i == 1, "Use DELETE_GROUP_CHAT only for single group deletion");
            string2 = context.getString(R.string.delete_group_button_text);
        }
        c019208x.A08(string2, new DialogInterface.OnClickListener() { // from class: X.3Zp
            {
                C2MZ.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C2MZ c2mz = C2MZ.this;
                CheckBox checkBox3 = checkBox;
                InterfaceC53642hH interfaceC53642hH2 = interfaceC53642hH;
                CheckBox checkBox4 = checkBox2;
                int i5 = i3;
                boolean z4 = z3;
                boolean isChecked = checkBox3.isChecked();
                interfaceC53642hH2.AN7(!checkBox4.isChecked(), isChecked);
                if (i5 == 2 && z4 != isChecked) {
                    C000200d.A0j(c2mz.A01, "pref_media_delete_per_conversation", isChecked);
                }
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Zn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                interfaceC53642hH.AMJ();
            }
        });
        return c019208x;
    }

    public final C019208x A05(Context context, final InterfaceC53642hH interfaceC53642hH, String str, boolean z, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_clear_messages, (ViewGroup) null);
        inflate.findViewById(R.id.delete_media_container);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.delete_media_checkbox);
        final CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.delete_starred_checkbox);
        checkBox.setChecked(z);
        ((TextView) inflate.findViewById(R.id.delete_media_checkbox_text)).setText(A00(context, i));
        inflate.findViewById(R.id.delete_media_container).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(checkBox, 6));
        inflate.findViewById(R.id.delete_starred_container).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(checkBox2, 5));
        C019208x c019208x = new C019208x(context);
        C019308y c019308y = c019208x.A01;
        c019308y.A0C = inflate;
        c019308y.A01 = 0;
        c019208x.A06(R.string.clear_all_chats_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: X.3Zm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                interfaceC53642hH.AN7(!checkBox2.isChecked(), checkBox.isChecked());
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Zj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                interfaceC53642hH.AMJ();
            }
        });
        if (!TextUtils.isEmpty(null)) {
            c019308y.A0I = null;
        } else {
            c019208x.A03(R.string.clear_all_chats_dialog_prompt);
        }
        if (!TextUtils.isEmpty(str)) {
            ((TextView) inflate.findViewById(R.id.clear_messages_dialog_message)).setText(str);
        }
        return c019208x;
    }

    public C0CI A06(ActivityC02330At activityC02330At) {
        C0CI c0ci = new C0CI();
        if (!this.A06.A02()) {
            c0ci.A00(Boolean.FALSE);
            return c0ci;
        }
        this.A07.ARy(new C53682hL(this, activityC02330At, c0ci), new Void[0]);
        return c0ci;
    }

    public void A07(C2II c2ii, AbstractC005302j abstractC005302j) {
        C53692hM c53692hM = new C53692hM(this.A02, abstractC005302j, c2ii);
        this.A07.ARy(c53692hM, new Void[0]);
        this.A00.A02.postDelayed(new RunnableEBaseShape4S0200000_I0_4(c53692hM, c2ii, 41), 500L);
    }

    public final boolean A08() {
        return this.A05.A0C(498) || this.A06.A02();
    }
}
