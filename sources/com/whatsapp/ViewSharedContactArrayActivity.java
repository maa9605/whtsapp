package com.whatsapp;

import X.AbstractC005302j;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass031;
import X.AnonymousClass094;
import X.C001200o;
import X.C002301c;
import X.C018608r;
import X.C018708s;
import X.C02160Ac;
import X.C02F;
import X.C02L;
import X.C04110Ip;
import X.C04120Iq;
import X.C05Q;
import X.C05W;
import X.C06C;
import X.C06K;
import X.C09010cT;
import X.C0C9;
import X.C0DB;
import X.C0HS;
import X.C0L5;
import X.C0LX;
import X.C0U1;
import X.C0WB;
import X.C0We;
import X.C0Zn;
import X.C1LS;
import X.C1LT;
import X.C1LU;
import X.C1LV;
import X.C1LW;
import X.C1LX;
import X.C28211Qs;
import X.C2IY;
import X.C2J8;
import X.C35681jX;
import X.C35691jY;
import X.C40951t8;
import X.C52762bH;
import X.C55392kL;
import X.InterfaceC002901k;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ViewSharedContactArrayActivity extends C0WB {
    public AnonymousClass031 A00;
    public C02L A01;
    public C018608r A02;
    public C06K A03;
    public C05W A04;
    public C2J8 A05;
    public C018708s A06;
    public C0Zn A07;
    public C0L5 A08;
    public AnonymousClass012 A09;
    public C001200o A0A;
    public C02F A0B;
    public C002301c A0C;
    public C05Q A0D;
    public C0C9 A0E;
    public AnonymousClass011 A0F;
    public AbstractC005302j A0G;
    public C52762bH A0H;
    public InterfaceC002901k A0I;
    public C40951t8 A0J;
    public C2IY A0K;
    public List A0L;
    public Pattern A0M;
    public C04110Ip A0N;
    public boolean A0O;
    public final ArrayList A0P = new ArrayList();
    public final ArrayList A0Q = new ArrayList();
    public final List A0S = new ArrayList();
    public final ArrayList A0R = new ArrayList();

    public static final C1LV A00(SparseArray sparseArray, int i) {
        C1LV c1lv = (C1LV) sparseArray.get(i);
        if (c1lv == null) {
            C1LV c1lv2 = new C1LV();
            sparseArray.put(i, c1lv2);
            return c1lv2;
        }
        return c1lv;
    }

    public static String A01(ViewSharedContactArrayActivity viewSharedContactArrayActivity, Class cls, int i) {
        String str = null;
        try {
            str = viewSharedContactArrayActivity.A0C.A07(((Integer) cls.getMethod("getTypeLabelResource", Integer.TYPE).invoke(null, Integer.valueOf(i))).intValue());
            return str;
        } catch (Exception e) {
            Log.e(e);
            return str;
        }
    }

    public static void A02(C35691jY c35691jY) {
        c35691jY.A01.setClickable(false);
        ImageView imageView = c35691jY.A04;
        imageView.setVisibility(8);
        imageView.setClickable(false);
        ImageView imageView2 = c35691jY.A05;
        imageView2.setVisibility(8);
        imageView2.setClickable(false);
    }

    public static void A03(ViewSharedContactArrayActivity viewSharedContactArrayActivity, C35691jY c35691jY, String str, String str2, int i, int i2, boolean z) {
        TextView textView;
        if (i2 > 1) {
            textView = c35691jY.A07;
            textView.setMaxLines(i2);
            textView.setSingleLine(false);
        } else {
            textView = c35691jY.A07;
            textView.setSingleLine(true);
        }
        C0LX.A03(textView);
        if (!str.equalsIgnoreCase("null")) {
            textView.setText(str);
        }
        if (str2 != null && !str2.equalsIgnoreCase("null")) {
            c35691jY.A06.setText(str2);
        } else {
            c35691jY.A06.setText(R.string.no_phone_type);
        }
        c35691jY.A03.setImageResource(i);
        if (viewSharedContactArrayActivity.A0O) {
            CheckBox checkBox = c35691jY.A02;
            checkBox.setChecked(z);
            checkBox.setClickable(false);
            checkBox.setVisibility(0);
            c35691jY.A00.setOnClickListener(new View.OnClickListener() { // from class: X.1FK
                {
                    ViewSharedContactArrayActivity.this = viewSharedContactArrayActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewSharedContactArrayActivity.this.toggleCheckBox(view);
                }
            });
        }
    }

    public static void A04(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        int i;
        C06C A09;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C04110Ip c04110Ip = ((C04120Iq) it.next()).A01;
                String A08 = c04110Ip.A08();
                if (!hashSet.contains(A08)) {
                    viewSharedContactArrayActivity.A0P.add(c04110Ip);
                    viewSharedContactArrayActivity.A0Q.add(new SparseArray());
                    hashSet.add(A08);
                } else if (c04110Ip.A05 != null) {
                    ArrayList arrayList = viewSharedContactArrayActivity.A0P;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C04110Ip c04110Ip2 = (C04110Ip) it2.next();
                        if (c04110Ip2.A08().equals(A08) && c04110Ip2.A05 != null && c04110Ip.A05.size() > c04110Ip2.A05.size()) {
                            arrayList.set(arrayList.indexOf(c04110Ip2), c04110Ip);
                        }
                    }
                }
            }
            if (viewSharedContactArrayActivity.A0L == null) {
                Collections.sort(viewSharedContactArrayActivity.A0P, new Comparator(viewSharedContactArrayActivity.A0C) { // from class: X.1LR
                    public final Collator A00;

                    {
                        Collator collator = Collator.getInstance(r3.A0I());
                        this.A00 = collator;
                        collator.setDecomposition(1);
                    }

                    @Override // java.util.Comparator
                    public int compare(Object obj, Object obj2) {
                        return this.A00.compare(((C04110Ip) obj).A08(), ((C04110Ip) obj2).A08());
                    }
                });
            }
            ImageView imageView = (ImageView) viewSharedContactArrayActivity.findViewById(R.id.send_btn);
            if (viewSharedContactArrayActivity.A0O) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(new C0We(viewSharedContactArrayActivity.A0C, C02160Ac.A03(viewSharedContactArrayActivity, R.drawable.input_send)));
                C0U1 A0c = viewSharedContactArrayActivity.A0c();
                if (A0c != null) {
                    A0c.A0H(viewSharedContactArrayActivity.A0C.A08(R.plurals.send_contacts, viewSharedContactArrayActivity.A0P.size()));
                } else {
                    throw null;
                }
            } else {
                imageView.setVisibility(8);
                int size = list.size();
                C0U1 A0c2 = viewSharedContactArrayActivity.A0c();
                if (A0c2 == null) {
                    throw null;
                }
                A0c2.A0H(viewSharedContactArrayActivity.A0C.A0A(R.plurals.view_contacts_title, size, Integer.valueOf(size)));
            }
            RecyclerView recyclerView = (RecyclerView) viewSharedContactArrayActivity.findViewById(R.id.rvContacts);
            ArrayList arrayList2 = viewSharedContactArrayActivity.A0P;
            List list2 = viewSharedContactArrayActivity.A0L;
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                C04110Ip c04110Ip3 = (C04110Ip) arrayList2.get(i2);
                SparseArray sparseArray = (SparseArray) viewSharedContactArrayActivity.A0Q.get(i2);
                arrayList3.add(new C1LU(c04110Ip3));
                ArrayList arrayList4 = new ArrayList();
                List<C09010cT> list3 = c04110Ip3.A05;
                if (list3 != null) {
                    i = 0;
                    for (C09010cT c09010cT : list3) {
                        if (c09010cT.A01 == null) {
                            arrayList4.add(c09010cT);
                        } else {
                            arrayList3.add(new C1LS(c09010cT, c04110Ip3.A08.A08, i2, i));
                            A00(sparseArray, i).A00 = c09010cT;
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                List list4 = c04110Ip3.A02;
                if (list4 != null) {
                    for (Object obj : list4) {
                        arrayList3.add(new C1LS(obj, c04110Ip3.A08.A08, i2, i));
                        A00(sparseArray, i).A00 = obj;
                        i++;
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    arrayList3.add(new C1LS(next, c04110Ip3.A08.A08, i2, i));
                    A00(sparseArray, i).A00 = next;
                    i++;
                }
                List list5 = c04110Ip3.A06;
                if (list5 != null) {
                    for (Object obj2 : list5) {
                        arrayList3.add(new C1LS(obj2, c04110Ip3.A08.A08, i2, i));
                        A00(sparseArray, i).A00 = obj2;
                        i++;
                    }
                }
                if (c04110Ip3.A07 != null) {
                    ArrayList arrayList5 = new ArrayList(c04110Ip3.A07.keySet());
                    Collections.sort(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        List<C55392kL> list6 = (List) c04110Ip3.A07.get(it4.next());
                        if (list6 != null) {
                            for (C55392kL c55392kL : list6) {
                                if (c55392kL.A01.equals("URL")) {
                                    c55392kL.toString();
                                    Pattern pattern = viewSharedContactArrayActivity.A0M;
                                    if (pattern == null) {
                                        pattern = Pattern.compile("(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&amp;=]*)?");
                                        viewSharedContactArrayActivity.A0M = pattern;
                                    }
                                    if (pattern.matcher(c55392kL.A02).matches()) {
                                        arrayList6.add(c55392kL);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        List<C55392kL> list7 = (List) c04110Ip3.A07.get(it5.next());
                        if (list7 != null) {
                            for (C55392kL c55392kL2 : list7) {
                                if (!c55392kL2.A01.equals("URL")) {
                                    c55392kL2.toString();
                                    arrayList6.add(c55392kL2);
                                }
                            }
                        }
                    }
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        Object next2 = it6.next();
                        arrayList3.add(new C1LS(next2, c04110Ip3.A08.A08, i2, i));
                        A00(sparseArray, i).A00 = next2;
                        i++;
                    }
                }
                if (list2 != null) {
                    C28211Qs c28211Qs = (C28211Qs) list2.get(i2);
                    UserJid nullable = UserJid.getNullable(c28211Qs.A02);
                    if (nullable != null && (A09 = viewSharedContactArrayActivity.A04.A09(nullable)) != null) {
                        arrayList3.add(new C1LW(viewSharedContactArrayActivity, A09, c28211Qs.A00, nullable));
                    }
                }
                arrayList3.add(new C1LT(null));
            }
            ((C1LT) arrayList3.get(arrayList3.size() - 1)).A00 = true;
            recyclerView.setAdapter(new C35681jX(viewSharedContactArrayActivity, arrayList3));
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            imageView.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1jV
                {
                    ViewSharedContactArrayActivity.this = viewSharedContactArrayActivity;
                }

                @Override // X.AbstractView$OnClickListenerC49532Ky
                public void A00(View view) {
                    ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = ViewSharedContactArrayActivity.this;
                    InterfaceC002901k interfaceC002901k = viewSharedContactArrayActivity2.A0I;
                    AnonymousClass012 anonymousClass012 = viewSharedContactArrayActivity2.A09;
                    C018608r c018608r = viewSharedContactArrayActivity2.A02;
                    C002301c c002301c = viewSharedContactArrayActivity2.A0C;
                    C0C9 c0c9 = viewSharedContactArrayActivity2.A0E;
                    AnonymousClass031 anonymousClass031 = viewSharedContactArrayActivity2.A00;
                    AbstractC005302j abstractC005302j = viewSharedContactArrayActivity2.A0G;
                    if (abstractC005302j != null) {
                        interfaceC002901k.ARy(new C0HS(anonymousClass012, c018608r, c002301c, c0c9, anonymousClass031, viewSharedContactArrayActivity2, abstractC005302j, viewSharedContactArrayActivity2.A0P, viewSharedContactArrayActivity2.A0Q, viewSharedContactArrayActivity2.getIntent().getBooleanExtra("has_number_from_url", false), C0DB.A05(viewSharedContactArrayActivity2.getIntent().getBundleExtra("quoted_message")), C011005l.A04(viewSharedContactArrayActivity2.getIntent().getStringExtra("quoted_group_jid"))) { // from class: X.1jc
                            public final AnonymousClass031 A00;
                            public final C018608r A01;
                            public final AnonymousClass012 A02;
                            public final C002301c A03;
                            public final C0C9 A04;
                            public final AbstractC005302j A05;
                            public final C011005l A06;
                            public final AnonymousClass094 A07;
                            public final WeakReference A08;
                            public final ArrayList A09;
                            public final ArrayList A0A;
                            public final boolean A0B;

                            {
                                this.A02 = anonymousClass012;
                                this.A01 = c018608r;
                                this.A03 = c002301c;
                                this.A04 = c0c9;
                                this.A00 = anonymousClass031;
                                this.A08 = new WeakReference(viewSharedContactArrayActivity2);
                                this.A05 = abstractC005302j;
                                this.A09 = r9;
                                this.A0A = r10;
                                this.A0B = r11;
                                this.A07 = r12;
                                this.A06 = r13;
                            }

                            @Override // X.C0HS
                            public void A06() {
                                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A08.get();
                                if (activityC02290Ap != null) {
                                    activityC02290Ap.AUr(R.string.processing, R.string.register_wait_message);
                                }
                            }

                            @Override // X.C0HS
                            public Object A07(Object[] objArr) {
                                ArrayList arrayList7;
                                AnonymousClass092 A00;
                                ArrayList arrayList8 = new ArrayList();
                                int i3 = 0;
                                while (true) {
                                    arrayList7 = this.A09;
                                    if (i3 >= arrayList7.size()) {
                                        break;
                                    }
                                    C04110Ip c04110Ip4 = (C04110Ip) arrayList7.get(i3);
                                    SparseArray sparseArray2 = (SparseArray) this.A0A.get(i3);
                                    for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                                        C1LV c1lv = (C1LV) sparseArray2.get(i4);
                                        if (!c1lv.A01) {
                                            C000200d.A0q("unchecked:", i4);
                                            Object obj3 = c1lv.A00;
                                            if (obj3 instanceof C55392kL) {
                                                C55392kL c55392kL3 = (C55392kL) obj3;
                                                List list8 = (List) c04110Ip4.A07.get(c55392kL3.A01);
                                                if (list8 != null) {
                                                    list8.remove(c55392kL3);
                                                    if (list8.isEmpty()) {
                                                        c04110Ip4.A07.remove(c55392kL3.A01);
                                                    }
                                                }
                                            } else if (obj3 instanceof C75903fj) {
                                                C75903fj c75903fj = (C75903fj) obj3;
                                                c04110Ip4.A02.remove(c75903fj);
                                                Class cls = c75903fj.A01;
                                                if (cls == ContactsContract.CommonDataKinds.Email.class) {
                                                    StringBuilder A0P = C000200d.A0P("email");
                                                    A0P.append(c1lv.A00);
                                                    Log.i(A0P.toString());
                                                } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                                                    StringBuilder A0P2 = C000200d.A0P("postal");
                                                    A0P2.append(c1lv.A00);
                                                    Log.i(A0P2.toString());
                                                }
                                            } else if (obj3 instanceof C09010cT) {
                                                c04110Ip4.A05.remove(obj3);
                                                StringBuilder sb = new StringBuilder("phone:");
                                                sb.append(c1lv.A00);
                                                Log.i(sb.toString());
                                            } else if (obj3 instanceof C75943fn) {
                                                c04110Ip4.A06.remove(obj3);
                                                StringBuilder sb2 = new StringBuilder("website:");
                                                sb2.append(c1lv.A00);
                                                Log.i(sb2.toString());
                                            }
                                        }
                                    }
                                    try {
                                        arrayList8.add(new C43291xA(this.A03, this.A00).A03(c04110Ip4));
                                        i3++;
                                    } catch (C43301xB e) {
                                        Log.e(e);
                                        return Boolean.FALSE;
                                    }
                                }
                                AnonymousClass094 anonymousClass094 = this.A07;
                                if (anonymousClass094 != null) {
                                    A00 = this.A04.A0F(anonymousClass094);
                                } else {
                                    C011005l c011005l = this.A06;
                                    A00 = c011005l != null ? C05U.A00(c011005l, this.A02.A05()) : null;
                                }
                                if (arrayList7.size() > 1) {
                                    C018608r c018608r2 = this.A01;
                                    AbstractC005302j abstractC005302j2 = this.A05;
                                    boolean z = this.A0B;
                                    if (c018608r2 != null) {
                                        c018608r2.A0h(Collections.singletonList(abstractC005302j2), arrayList8, A00, z);
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    C018608r c018608r3 = this.A01;
                                    AbstractC005302j abstractC005302j3 = this.A05;
                                    String A082 = ((C04110Ip) arrayList7.get(0)).A08();
                                    String str = (String) arrayList8.get(0);
                                    boolean z2 = this.A0B;
                                    if (c018608r3 != null) {
                                        c018608r3.A0f(Collections.singletonList(abstractC005302j3), A082, str, A00, z2);
                                    } else {
                                        throw null;
                                    }
                                }
                                return Boolean.TRUE;
                            }

                            @Override // X.C0HS
                            public void A09(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A08.get();
                                if (activityC02290Ap != null) {
                                    activityC02290Ap.ARS();
                                    if (bool.booleanValue()) {
                                        activityC02290Ap.setResult(-1);
                                        activityC02290Ap.finish();
                                        return;
                                    }
                                    activityC02290Ap.AUj(R.string.must_have_displayname);
                                }
                            }
                        }, new Void[0]);
                        return;
                    }
                    throw null;
                }
            });
            return;
        }
        Log.w("viewsharedcontactarrayactivity/oncreate/no vcards to display");
        ((ActivityC02290Ap) viewSharedContactArrayActivity).A0A.A07(R.string.error_parse_vcard, 0);
        viewSharedContactArrayActivity.finish();
    }

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.error_parse_vcard) {
            finish();
        }
    }

    public /* synthetic */ void A1P(C04110Ip c04110Ip, Bitmap bitmap) {
        if (((ActivityC02270An) this).A00.A09(this, C2J8.A00(this, c04110Ip, bitmap, true), 1)) {
            this.A0H.A02(true, 10);
        }
    }

    public /* synthetic */ void A1Q(C04110Ip c04110Ip, Bitmap bitmap) {
        if (((ActivityC02270An) this).A00.A09(this, C2J8.A00(this, c04110Ip, bitmap, false), 1)) {
            this.A0H.A02(false, 10);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1 && this.A0N != null) {
                String str = null;
                if (intent != null && intent.getData() != null) {
                    str = intent.getData().getLastPathSegment();
                }
                this.A05.A02(this.A0R, this.A0S, this.A0N.A08(), str);
            }
            this.A0H.A00();
        }
    }

    @Override // X.C0WB, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0H = new C52762bH(this.A0F, ((ActivityC02290Ap) this).A0B, ((ActivityC02290Ap) this).A0E, this.A0B);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.view_shared_contact_array);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vcard");
        AnonymousClass094 A05 = C0DB.A05(intent.getBundleExtra("vcard_message"));
        List stringArrayListExtra = intent.getStringArrayListExtra("vcard_array");
        Uri uri = (Uri) intent.getParcelableExtra("vcard_uri");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("vcard_sender_infos");
        if (stringExtra != null) {
            stringArrayListExtra = Collections.singletonList(stringExtra);
        }
        C1LX c1lx = new C1LX(stringArrayListExtra, A05, uri, parcelableArrayListExtra);
        this.A07 = this.A08.A04(this);
        this.A0O = getIntent().getBooleanExtra("edit_mode", true);
        this.A0G = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
        this.A0L = c1lx.A02;
        this.A0I.ARy(new C0HS(this.A0A, this.A0J, this.A04, this.A0C, this.A0D, this.A03, this, c1lx) { // from class: X.1jb
            public final C1LX A00;
            public final C06K A01;
            public final C05W A02;
            public final C001200o A03;
            public final C002301c A04;
            public final C05Q A05;
            public final C40951t8 A06;
            public final WeakReference A07;

            {
                this.A03 = r2;
                this.A06 = r3;
                this.A02 = r4;
                this.A04 = r5;
                this.A05 = r6;
                this.A01 = r7;
                this.A07 = new WeakReference(this);
                this.A00 = c1lx;
            }

            @Override // X.C0HS
            public void A06() {
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A07.get();
                if (activityC02290Ap != null) {
                    activityC02290Ap.AUr(R.string.processing, R.string.register_wait_message);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                ?? arrayList;
                C04110Ip A052;
                List<C09010cT> list;
                List A0q;
                C1LX c1lx2 = this.A00;
                AnonymousClass094 anonymousClass094 = c1lx2.A01;
                List list2 = null;
                if (anonymousClass094 != null) {
                    AnonymousClass092 A053 = this.A05.A05(anonymousClass094);
                    if (A053 != null) {
                        C001200o c001200o = this.A03;
                        C40951t8 c40951t8 = this.A06;
                        C05W c05w = this.A02;
                        C002301c c002301c = this.A04;
                        C06K c06k = this.A01;
                        if (A053 instanceof C0D8) {
                            C04120Iq A19 = ((C0D8) A053).A19(c001200o, c05w, c002301c, c06k);
                            if (A19 != null) {
                                return Collections.singletonList(A19);
                            }
                            return null;
                        } else if (A053 instanceof C0DA) {
                            C0DA c0da = (C0DA) A053;
                            List list3 = c0da.A02;
                            if (list3 == null) {
                                List A02 = C04110Ip.A02(c001200o, c05w, c002301c, c0da.A03, c0da.A18());
                                c0da.A02 = A02;
                                return A02;
                            }
                            return list3;
                        } else if (!C0DB.A0d(A053) || (A0q = C02180Ae.A0q(c40951t8, A053)) == null) {
                            return null;
                        } else {
                            return C04110Ip.A02(c001200o, c05w, c002301c, c06k, A0q);
                        }
                    }
                    return null;
                }
                List list4 = c1lx2.A03;
                if (list4 != null) {
                    return C04110Ip.A02(this.A03, this.A02, this.A04, this.A01, list4);
                }
                Uri uri2 = c1lx2.A00;
                if (uri2 == null) {
                    List<C28211Qs> list5 = c1lx2.A02;
                    if (list5 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C28211Qs c28211Qs : list5) {
                            UserJid nullable = UserJid.getNullable(c28211Qs.A01);
                            AnonymousClass092 A01 = this.A05.A01(c28211Qs.A00);
                            if (nullable != null && A01 != null) {
                                List<String> A0q2 = C02180Ae.A0q(this.A06, A01);
                                if (A0q2 == null) {
                                    arrayList = Collections.emptyList();
                                } else {
                                    arrayList = new ArrayList();
                                    for (String str : A0q2) {
                                        StringBuilder A0P = C000200d.A0P("waid=");
                                        A0P.append(nullable.user);
                                        if (str.contains(A0P.toString()) && (A052 = C04110Ip.A05(this.A03, this.A02, this.A04, this.A01, str)) != null && (list = A052.A05) != null) {
                                            for (C09010cT c09010cT : list) {
                                                if (nullable.equals(c09010cT.A01)) {
                                                    arrayList.add(new C04120Iq(str, A052));
                                                }
                                            }
                                        }
                                    }
                                }
                                arrayList2.addAll(arrayList);
                            }
                        }
                        return arrayList2;
                    }
                    return null;
                }
                try {
                    C40951t8 c40951t82 = this.A06;
                    list2 = c40951t82.A01(c40951t82.A02(uri2)).A02;
                    return list2;
                } catch (C43301xB | IOException e) {
                    Log.e(e);
                    return list2;
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                List list = (List) obj;
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A07.get();
                if (viewSharedContactArrayActivity != null) {
                    viewSharedContactArrayActivity.ARS();
                    ViewSharedContactArrayActivity.A04(viewSharedContactArrayActivity, list);
                }
            }
        }, new Void[0]);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00();
    }

    public final void toggleCheckBox(View view) {
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.cbx);
        if (compoundButton.isChecked()) {
            compoundButton.setChecked(false);
        } else {
            compoundButton.setChecked(true);
        }
        ((C1LV) view.getTag()).A01 = compoundButton.isChecked();
    }
}
