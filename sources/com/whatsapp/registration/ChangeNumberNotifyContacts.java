package com.whatsapp.registration;

import X.AbstractActivityC50012Ov;
import X.AbstractC005302j;
import X.AbstractC02750Cs;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C002301c;
import X.C003101m;
import X.C02160Ac;
import X.C02780Cv;
import X.C02F;
import X.C05M;
import X.C05W;
import X.C06C;
import X.C0U1;
import X.C2MG;
import X.C3V9;
import X.C40261rr;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.ChangeNumberNotifyContacts;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class ChangeNumberNotifyContacts extends AbstractActivityC50012Ov {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public RadioButton A05;
    public RadioButton A06;
    public RadioButton A07;
    public ScrollView A08;
    public Switch A09;
    public TextEmojiLabel A0A;
    public C40261rr A0B;
    public C05W A0C;
    public C02F A0D;
    public C05M A0E;
    public C2MG A0F;
    public List A0G;

    public final void A1P() {
        if (this.A08.canScrollVertically(1)) {
            this.A02.setElevation(this.A00);
        } else {
            this.A02.setElevation(0.0f);
        }
    }

    public final void A1Q() {
        this.A01 = 2;
        this.A03.setVisibility(0);
        this.A0G.clear();
        List list = this.A0G;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        A1S(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) ((C06C) it.next()).A03(UserJid.class);
            if (abstractC005302j != null && this.A0E.A0E(abstractC005302j)) {
                hashSet.add(abstractC005302j);
            }
        }
        list.addAll(hashSet);
    }

    public final void A1R() {
        if (this.A01 == 0) {
            this.A09.setChecked(false);
            this.A0A.setText(R.string.change_number_notify_none);
            this.A03.setVisibility(8);
            this.A06.setChecked(true);
            return;
        }
        this.A09.setChecked(true);
        int size = this.A0G.size();
        Spanned fromHtml = Html.fromHtml(((ActivityC02310Ar) this).A01.A0A(R.plurals.change_number_n_contacts, size, Integer.valueOf(size)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contacts-link".equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AbstractC02750Cs(this) { // from class: X.3wa
                        {
                            ChangeNumberNotifyContacts.this = this;
                        }

                        @Override // X.InterfaceC02760Ct
                        public void onClick(View view) {
                            ChangeNumberNotifyContacts changeNumberNotifyContacts = ChangeNumberNotifyContacts.this;
                            Intent intent = new Intent(changeNumberNotifyContacts, NotifyContactsSelector.class);
                            intent.putStringArrayListExtra("selected", C003101m.A0E(changeNumberNotifyContacts.A0G));
                            changeNumberNotifyContacts.startActivityForResult(intent, 1);
                        }
                    }, spanStart, spanEnd, spanFlags);
                }
            }
        }
        C000200d.A0b(this.A0A);
        TextEmojiLabel textEmojiLabel = this.A0A;
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(((ActivityC02290Ap) this).A0E, textEmojiLabel));
        this.A0A.setText(spannableStringBuilder);
        this.A03.setVisibility(0);
        this.A05.setChecked(this.A01 == 1);
        this.A06.setChecked(this.A01 == 2);
        this.A07.setChecked(this.A01 == 3);
    }

    public final void A1S(ArrayList arrayList) {
        this.A0C.A05.A0V(arrayList, 1, false, true);
        Set A02 = this.A0B.A02();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractCollection) A02).contains(((C06C) it.next()).A03(UserJid.class))) {
                it.remove();
            }
        }
    }

    public void A1T(List list) {
        ArrayList arrayList = new ArrayList();
        A1S(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Jid A03 = ((C06C) it.next()).A03(UserJid.class);
            if (A03 != null) {
                list.add(A03);
            }
        }
    }

    public /* synthetic */ void lambda$onCreate$2146$ChangeNumberNotifyContacts(View view) {
        Log.i("changenumbernotifycontacts/done");
        Intent intent = new Intent();
        intent.putStringArrayListExtra("selectedJids", C003101m.A0E(this.A0G));
        setResult(-1, intent);
        finish();
    }

    public /* synthetic */ void lambda$onCreate$2148$ChangeNumberNotifyContacts(View view) {
        this.A09.toggle();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 != -1) {
                Log.i("listmembersselector/permissions denied");
                this.A09.setChecked(false);
                return;
            }
            A1Q();
            A1R();
        } else if (i == 1) {
            if (i2 == -1) {
                this.A0G = C003101m.A0F(UserJid.class, intent.getStringArrayListExtra("jids"));
                this.A01 = 3;
            }
            A1R();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A08.getViewTreeObserver().addOnPreDrawListener(new C3V9(this));
        }
    }

    @Override // X.AbstractActivityC50012Ov, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.change_number_title);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            setContentView(R.layout.change_number_notify_contacts);
            findViewById(R.id.confirm_change_btn).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 37));
            Intent intent = getIntent();
            C002301c c002301c = ((ActivityC02310Ar) this).A01;
            StringBuilder A0P = C000200d.A0P("+");
            A0P.append(intent.getStringExtra("oldJid"));
            String A0F = c002301c.A0F(A0P.toString());
            C002301c c002301c2 = ((ActivityC02310Ar) this).A01;
            StringBuilder A0P2 = C000200d.A0P("+");
            A0P2.append(intent.getStringExtra("newJid"));
            String A0F2 = c002301c2.A0F(A0P2.toString());
            String string = getString(R.string.change_number_confirm_old_new, A0F, A0F2);
            int indexOf = string.indexOf(A0F);
            int indexOf2 = string.indexOf(A0F2);
            SpannableString spannableString = new SpannableString(string);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C02160Ac.A00(this, R.color.settings_item_title_text));
            int length = A0F.length() + indexOf;
            spannableString.setSpan(foregroundColorSpan, indexOf, length, 17);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), indexOf, length, 17);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C02160Ac.A00(this, R.color.settings_item_title_text));
            int length2 = A0F2.length() + indexOf2;
            spannableString.setSpan(foregroundColorSpan2, indexOf2, length2, 17);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), indexOf2, length2, 17);
            ((TextView) findViewById(R.id.change_number_from_to)).setText(spannableString);
            this.A08 = (ScrollView) findViewById(R.id.scroll_view);
            this.A04 = findViewById(R.id.notify_contacts_container);
            Switch r1 = (Switch) findViewById(R.id.notify_contacts_switch);
            this.A09 = r1;
            r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.3UB
                {
                    ChangeNumberNotifyContacts.this = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ChangeNumberNotifyContacts changeNumberNotifyContacts = ChangeNumberNotifyContacts.this;
                    if (z) {
                        if (!changeNumberNotifyContacts.A0D.A03()) {
                            RequestPermissionActivity.A04(changeNumberNotifyContacts, R.string.permission_contacts_access_on_notify_contacts_change_number_request, R.string.permission_contacts_access_on_notify_contacts_change_number);
                            return;
                        }
                        changeNumberNotifyContacts.A1Q();
                        changeNumberNotifyContacts.A1R();
                        return;
                    }
                    changeNumberNotifyContacts.A01 = 0;
                    changeNumberNotifyContacts.A03.setVisibility(8);
                    changeNumberNotifyContacts.A0G.clear();
                    changeNumberNotifyContacts.A1R();
                }
            });
            this.A04.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 36));
            View findViewById = findViewById(R.id.change_number_radio_buttons_container);
            this.A03 = findViewById;
            this.A05 = (RadioButton) findViewById.findViewById(R.id.change_number_all_btn);
            findViewById(R.id.change_number_all).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 48));
            this.A06 = (RadioButton) this.A03.findViewById(R.id.change_number_chats_btn);
            findViewById(R.id.change_number_chats).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 48));
            this.A07 = (RadioButton) this.A03.findViewById(R.id.change_number_custom_btn);
            findViewById(R.id.change_number_custom).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 48));
            this.A0A = (TextEmojiLabel) findViewById(R.id.change_number_notified_amount);
            this.A02 = findViewById(R.id.bottom_button_container);
            if (bundle != null) {
                int i = bundle.getInt("mode");
                this.A01 = i;
                if (i == 3) {
                    this.A0G = C003101m.A0F(UserJid.class, bundle.getStringArrayList("selectedJids"));
                }
            } else {
                int intExtra = intent.getIntExtra("mode", 2);
                this.A01 = intExtra;
                if (intExtra == 3) {
                    this.A0G = C003101m.A0F(UserJid.class, intent.getStringArrayListExtra("preselectedJids"));
                }
            }
            if (this.A0G == null) {
                this.A0G = new ArrayList();
            }
            if (!this.A0D.A03()) {
                this.A01 = 0;
                this.A03.setVisibility(8);
                this.A0G.clear();
            } else {
                int i2 = this.A01;
                if (i2 == 1) {
                    this.A01 = 1;
                    this.A0G.clear();
                    A1T(this.A0G);
                } else if (i2 == 2) {
                    A1Q();
                } else if (i2 == 3) {
                    List arrayList = new ArrayList();
                    A1T(arrayList);
                    HashSet hashSet = new HashSet(arrayList);
                    Iterator it = this.A0G.iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains(it.next())) {
                            it.remove();
                        }
                    }
                }
            }
            A1R();
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A08.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3V2
                    {
                        ChangeNumberNotifyContacts.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        ChangeNumberNotifyContacts.this.A1P();
                    }
                });
                this.A08.getViewTreeObserver().addOnPreDrawListener(new C3V9(this));
                return;
            }
            return;
        }
        throw null;
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.change_number_all) {
            if (this.A01 != 1) {
                this.A01 = 1;
                this.A0G.clear();
                A1T(this.A0G);
                A1R();
            }
        } else if (id == R.id.change_number_chats) {
            if (this.A01 == 2) {
                return;
            }
            A1Q();
            A1R();
        } else if (id != R.id.change_number_custom) {
        } else {
            startActivityForResult(new Intent(this, NotifyContactsSelector.class), 1);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        final boolean isChecked = this.A09.isChecked();
        super.onRestoreInstanceState(bundle);
        this.A04.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.3V8
            {
                ChangeNumberNotifyContacts.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ChangeNumberNotifyContacts changeNumberNotifyContacts = ChangeNumberNotifyContacts.this;
                changeNumberNotifyContacts.A04.getViewTreeObserver().removeOnPreDrawListener(this);
                Switch r2 = changeNumberNotifyContacts.A09;
                boolean z = isChecked;
                r2.setChecked(!z);
                changeNumberNotifyContacts.A09.setChecked(z);
                return false;
            }
        });
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("selectedJids", C003101m.A0E(this.A0G));
        bundle.putInt("mode", this.A01);
    }
}
