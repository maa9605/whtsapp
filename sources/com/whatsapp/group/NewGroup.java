package com.whatsapp.group;

import X.AbstractActivityC49212Jc;
import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.AnonymousClass223;
import X.C002701i;
import X.C003101m;
import X.C011005l;
import X.C011505r;
import X.C018708s;
import X.C01B;
import X.C01C;
import X.C02E;
import X.C02O;
import X.C03340Fh;
import X.C04470Kh;
import X.C05160No;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C06C;
import X.C07A;
import X.C09190cp;
import X.C0AT;
import X.C0C9;
import X.C0E7;
import X.C0ES;
import X.C0FK;
import X.C0GG;
import X.C0L5;
import X.C0LF;
import X.C0LX;
import X.C0U1;
import X.C0Zn;
import X.C2MB;
import X.C2MI;
import X.C41991uq;
import X.C43981yK;
import X.C455822q;
import X.C456723a;
import X.C457323i;
import X.C47682Ce;
import X.C48362Ey;
import X.C49202Ja;
import X.C52662b7;
import X.InterfaceC04830Lz;
import X.InterfaceC09180cm;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.crop.CropImage;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.group.NewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class NewGroup extends AbstractActivityC49212Jc {
    public int A00;
    public Bundle A01;
    public CheckBox A02;
    public ImageButton A03;
    public ImageView A04;
    public C0FK A05;
    public KeyboardPopupLayout A07;
    public C01B A08;
    public WaEditText A09;
    public C05W A0A;
    public C018708s A0B;
    public C011505r A0C;
    public C04470Kh A0D;
    public C0Zn A0E;
    public C0L5 A0F;
    public C0LF A0G;
    public C0E7 A0H;
    public C02E A0I;
    public AnonymousClass012 A0J;
    public C05M A0K;
    public C03340Fh A0L;
    public C0C9 A0M;
    public C48362Ey A0N;
    public C47682Ce A0O;
    public C2MI A0P;
    public AnonymousClass011 A0Q;
    public C455822q A0R;
    public C0ES A0S;
    public C05Y A0T;
    public C02O A0U;
    public C456723a A0V;
    public C07A A0W;
    public C41991uq A0X;
    public Integer A0Y;
    public List A0Z;
    public final AtomicReference A0c = new AtomicReference();
    public InterfaceC09180cm A06 = new InterfaceC09180cm() { // from class: X.3Co
        {
            NewGroup.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            NewGroup.this.A09.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            NewGroup newGroup = NewGroup.this;
            C002701i.A1H(newGroup.A09, iArr, newGroup.A08.A07(C01C.A3z));
        }
    };
    public final C0GG A0a = new C49202Ja(this);
    public final C06C A0b = new C06C() { // from class: X.0fR
        @Override // X.C06C
        public boolean A0C() {
            return true;
        }

        {
            this.A01 = -1;
            this.A02 = -1;
        }
    };

    public static void A00(Activity activity, int i, Collection collection) {
        Intent intent = new Intent(activity, GroupMembersSelector.class);
        intent.putExtra("entry_point", i);
        if (collection != null && !collection.isEmpty()) {
            intent.putExtra("selected", new ArrayList(collection));
        }
        activity.startActivity(intent);
    }

    public static void A01(NewGroup newGroup, C011005l c011005l) {
        Intent intent = new Intent();
        intent.putExtra("group_jid", c011005l.getRawString());
        if (newGroup.A01 != null) {
            newGroup.A09.A01();
            intent.putExtra("invite_bundle", newGroup.A01);
        }
        newGroup.setResult(-1, intent);
    }

    public final void A1P(List list) {
        String A0t = C002701i.A0t(this.A09.getText().toString());
        int A01 = C43981yK.A01(A0t);
        int A07 = this.A08.A07(C01C.A3z);
        if (A01 <= A07) {
            if (list.isEmpty()) {
                ((ActivityC02290Ap) this).A0A.A07(R.string.no_valid_participant, 0);
                return;
            }
            C05160No A03 = C05160No.A03(this.A0S.A06, UUID.randomUUID().toString().replace("-", ""));
            this.A0S.A0D(A03, list, true);
            if (this.A0H.A05()) {
                StringBuilder sb = new StringBuilder("newgroup/go create group:");
                sb.append(A03);
                Log.i(sb.toString());
                A12(R.string.creating_group);
                this.A05 = new C0FK(A03, new RunnableEBaseShape0S1300000_I0(this, A03, A0t, list, 4));
                this.A0M.A0Q(this.A0W.A04(A03, this.A0J.A05(), 2, A0t, list));
                ((ActivityC02290Ap) this).A0A.A02.postDelayed(new RunnableEBaseShape3S0100000_I0_3(this, 10), 10000L);
                return;
            }
            Log.i("newgroup/no network access, fail to create group");
            this.A0M.A0Q(this.A0W.A04(A03, this.A0J.A05(), 3, A0t, list));
            File A032 = this.A0C.A03(this.A0b);
            if (A032.exists()) {
                try {
                    C457323i A02 = this.A0V.A02(A032);
                    this.A0D.A03(this.A0A.A0A(A03), A02.A00, A02.A01);
                } catch (IOException e) {
                    Log.e("newgroup/failed to update photo", e);
                }
            }
            setResult(-1);
            finish();
            return;
        }
        ((ActivityC02290Ap) this).A0A.A0E(getResources().getQuantityString(R.plurals.subject_reach_limit, A07, Integer.valueOf(A07)), 0);
    }

    public /* synthetic */ void lambda$onCreate$1810$NewGroup(View view) {
        C06C c06c = this.A0b;
        c06c.A0F = this.A09.getText().toString();
        this.A0V.A04(this, c06c, 12);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            this.A0V.A03().delete();
            if (i2 == -1) {
                Log.i("newgroup/photopicked");
                this.A04.setImageBitmap(this.A0G.A02(this, this.A0b, getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size), 0.0f, false));
            } else if (i2 != 0 || intent == null) {
            } else {
                CropImage.A00(this.A0V.A02, intent, this);
            }
        } else if (i2 != -1) {
        } else {
            if (intent != null && intent.getBooleanExtra("is_reset", false)) {
                Log.i("newgroup/resetphoto");
                C011505r c011505r = this.A0C;
                C06C c06c = this.A0b;
                c011505r.A03(c06c).delete();
                this.A0C.A04(c06c).delete();
                this.A04.setImageResource(R.drawable.ic_addphoto);
                return;
            }
            Log.i("newgroup/cropphoto");
            this.A0V.A05(this, intent, 13, this);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C48362Ey c48362Ey = this.A0N;
        if (c48362Ey == null || !c48362Ey.isShowing()) {
            super.onBackPressed();
        } else {
            this.A0N.dismiss();
        }
    }

    @Override // X.AbstractActivityC49212Jc, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A06;
        super.onCreate(bundle);
        setTitle(R.string.new_group);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            A0c.A07(R.string.add_subject);
            setContentView(R.layout.new_group);
            this.A0E = this.A0F.A04(this);
            ImageView imageView = (ImageView) findViewById(R.id.change_photo_btn);
            this.A04 = imageView;
            imageView.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 15));
            if (bundle != null) {
                this.A00 = bundle.getInt("input_method");
            } else {
                this.A00 = 0;
                C011505r c011505r = this.A0C;
                C06C c06c = this.A0b;
                c011505r.A03(c06c).delete();
                this.A0C.A04(c06c).delete();
            }
            this.A07 = (KeyboardPopupLayout) findViewById(R.id.main);
            WaEditText waEditText = (WaEditText) findViewById(R.id.group_name);
            this.A09 = waEditText;
            C48362Ey c48362Ey = new C48362Ey(this, this.A0R, ((ActivityC02270An) this).A0F, ((ActivityC02290Ap) this).A08, ((ActivityC02290Ap) this).A0H, ((ActivityC02290Ap) this).A0G, this.A0O, this.A0I, ((ActivityC02310Ar) this).A01, this.A0P, ((ActivityC02290Ap) this).A0F, this.A0U, this.A07, (ImageButton) findViewById(R.id.emoji_btn), waEditText);
            this.A0N = c48362Ey;
            c48362Ey.A0A(this.A06);
            AnonymousClass223 anonymousClass223 = new AnonymousClass223((EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0N, this, ((ActivityC02290Ap) this).A0H, this.A0O, ((ActivityC02310Ar) this).A01, this.A0U);
            anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3CK
                {
                    NewGroup.this = this;
                }

                @Override // X.InterfaceC04830Lz
                public final void AJj(C2CI c2ci) {
                    NewGroup.this.A06.AJi(c2ci.A00);
                }
            };
            this.A0N.A0C = new RunnableEBaseShape3S0100000_I0_3(anonymousClass223, 11);
            this.A04.setImageResource(R.drawable.ic_addphoto);
            C0LX.A0A(((ActivityC02310Ar) this).A01, this.A09);
            int A07 = this.A08.A07(C01C.A3z);
            this.A09.setFilters(new InputFilter[]{new C09190cp(A07)});
            WaEditText waEditText2 = this.A09;
            waEditText2.addTextChangedListener(new C52662b7(((ActivityC02290Ap) this).A0H, this.A0I, ((ActivityC02310Ar) this).A01, this.A0U, waEditText2, (TextView) findViewById(R.id.subject_counter_tv), A07, A07, false));
            List A0F = C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("selected"));
            AbstractCollection abstractCollection = (AbstractCollection) A0F;
            this.A0Z = new ArrayList(abstractCollection.size());
            if (!abstractCollection.isEmpty()) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    this.A0Z.add(this.A0A.A0A((AbstractC005302j) it.next()));
                }
            }
            View findViewById = findViewById(R.id.ok_btn);
            if (findViewById != null) {
                ImageButton imageButton = (ImageButton) findViewById;
                this.A03 = imageButton;
                imageButton.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(A0F, this, 13));
                ((AbsListView) findViewById(R.id.selected_items)).setAdapter((ListAdapter) new ArrayAdapter(this, this.A0Z) { // from class: X.2wk
                    public final LayoutInflater A00;

                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public long getItemId(int i) {
                        return i << 10;
                    }

                    @Override // android.widget.BaseAdapter, android.widget.Adapter
                    public boolean hasStableIds() {
                        return true;
                    }

                    {
                        NewGroup.this = this;
                        this.A00 = LayoutInflater.from(NewGroup.this);
                    }

                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public int getCount() {
                        return NewGroup.this.A0Z.size();
                    }

                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public Object getItem(int i) {
                        return NewGroup.this.A0Z.get(i);
                    }

                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i, View view, ViewGroup viewGroup) {
                        NewGroup newGroup = NewGroup.this;
                        C06C c06c2 = (C06C) newGroup.A0Z.get(i);
                        if (c06c2 != null) {
                            if (view == null) {
                                view = this.A00.inflate(R.layout.selected_contact, viewGroup, false);
                            }
                            ((TextView) C0AT.A0D(view, R.id.contact_name)).setText(newGroup.A0B.A08(c06c2, false));
                            C0AT.A0D(view, R.id.close).setVisibility(8);
                            ImageView imageView2 = (ImageView) C0AT.A0D(view, R.id.contact_row_photo);
                            newGroup.A0E.A02(c06c2, imageView2);
                            C0AT.A0V(imageView2, 2);
                            AnonymousClass088.A1W(view, new C0AV(1, R.string.new_group_contact_content_description));
                            return view;
                        }
                        throw null;
                    }
                });
                int size = this.A0Z.size();
                AtomicReference atomicReference = this.A0c;
                String string = (atomicReference.get() == null || (A06 = this.A0S.A06((C011005l) atomicReference.get())) <= 0) ? getString(R.string.new_group_n_contacts_selected, Integer.valueOf(size)) : getString(R.string.new_group_n_of_m_contacts_selected, Integer.valueOf(size), Integer.valueOf(A06));
                TextView textView = (TextView) findViewById(R.id.selected_header);
                textView.setText(string);
                C0AT.A0M(textView);
                this.A0L.A00(this.A0a);
                Integer valueOf = Integer.valueOf(getIntent().getIntExtra("entry_point", -1));
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                this.A0Y = valueOf;
                if (this.A0S.A0U.A0C(308)) {
                    View findViewById2 = findViewById(R.id.experimental_checkbox);
                    if (findViewById2 != null) {
                        CheckBox checkBox = (CheckBox) findViewById2;
                        this.A02 = checkBox;
                        checkBox.setVisibility(0);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
                        marginLayoutParams.setMargins(0, AnonymousClass088.A02(this, 122.0f), 0, 0);
                        this.A03.setLayoutParams(marginLayoutParams);
                        View findViewById3 = findViewById(R.id.group_setting_layout);
                        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                        layoutParams.height = AnonymousClass088.A02(this, 170.0f);
                        findViewById3.setLayoutParams(layoutParams);
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0L.A01(this.A0a);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        if (this.A0N.isShowing()) {
            i = 1;
            this.A00 = 1;
        } else if (C2MB.A00(this.A07)) {
            i = 0;
            this.A00 = 0;
        } else {
            i = 2;
            this.A00 = 2;
        }
        bundle.putInt("input_method", i);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0N.isShowing()) {
                this.A07.post(new RunnableEBaseShape3S0100000_I0_3(this, 9));
            }
            getWindow().setSoftInputMode(2);
            return;
        }
        getWindow().setSoftInputMode(4);
    }
}
