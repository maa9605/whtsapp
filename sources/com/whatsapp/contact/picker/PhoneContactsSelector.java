package com.whatsapp.contact.picker;

import X.AbstractC005302j;
import X.AbstractC08920cK;
import X.ActivityC02290Ap;
import X.AnonymousClass031;
import X.AnonymousClass370;
import X.AnonymousClass371;
import X.C000700j;
import X.C001200o;
import X.C002301c;
import X.C01B;
import X.C02160Ac;
import X.C02620Cd;
import X.C02E;
import X.C02F;
import X.C04110Ip;
import X.C05W;
import X.C06K;
import X.C07630Zb;
import X.C0HS;
import X.C0L5;
import X.C0L7;
import X.C0U1;
import X.C0W5;
import X.C0We;
import X.C0Zn;
import X.C2LB;
import X.C2LC;
import X.C2LD;
import X.C2MG;
import X.C43291xA;
import X.C43301xB;
import X.C55392kL;
import X.C58032qT;
import X.C653836z;
import X.C75893fi;
import X.C75903fj;
import X.InterfaceC002901k;
import X.InterfaceC07650Zd;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PhoneContactsSelector extends C2LB {
    public MenuItem A00;
    public View A01;
    public View A02;
    public ListView A03;
    public RecyclerView A04;
    public AnonymousClass031 A05;
    public C07630Zb A06;
    public C01B A07;
    public C0W5 A08;
    public C06K A09;
    public C0L7 A0A;
    public C05W A0B;
    public C0Zn A0C;
    public C0L5 A0D;
    public C58032qT A0E;
    public C653836z A0F;
    public AnonymousClass370 A0G;
    public C02E A0I;
    public C001200o A0J;
    public C02F A0K;
    public C002301c A0L;
    public AbstractC005302j A0M;
    public C2MG A0N;
    public InterfaceC002901k A0O;
    public String A0P;
    public ArrayList A0Q;
    public boolean A0R;
    public boolean A0S;
    public final ArrayList A0U = new ArrayList();
    public final ArrayList A0T = new ArrayList();
    public final List A0V = new ArrayList();
    public AnonymousClass371 A0H = new AnonymousClass371(this);

    public static String A00(C001200o c001200o, C01B c01b, C05W c05w, C002301c c002301c, AnonymousClass031 anonymousClass031, C06K c06k, C2LC c2lc) {
        int i;
        String str;
        C000700j.A00();
        C04110Ip c04110Ip = new C04110Ip(c001200o, c05w, c002301c, c06k);
        String obj = Long.valueOf(c2lc.A04).toString();
        c04110Ip.A08.A01 = c2lc.A06;
        C001200o c001200o2 = c04110Ip.A0C;
        Cursor query = c001200o2.A00.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data2", "data3", "data5", "data4", "data6", "data7", "data9"}, "contact_id = ? AND mimetype=?", new String[]{obj, "vnd.android.cursor.item/name"}, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    c04110Ip.A08.A02 = query.getString(query.getColumnIndex("data2"));
                    c04110Ip.A08.A00 = query.getString(query.getColumnIndex("data3"));
                    c04110Ip.A08.A03 = query.getString(query.getColumnIndex("data5"));
                    c04110Ip.A08.A06 = query.getString(query.getColumnIndex("data4"));
                    c04110Ip.A08.A07 = query.getString(query.getColumnIndex("data6"));
                    c04110Ip.A08.A04 = query.getString(query.getColumnIndex("data7"));
                    c04110Ip.A08.A05 = query.getString(query.getColumnIndex("data9"));
                } finally {
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
            query.close();
        }
        Cursor query2 = c001200o2.A00.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data2", "data1", "data3", "is_primary", "raw_contact_id"}, "contact_id =?", new String[]{obj}, null);
        try {
            Map A03 = C04110Ip.A03(obj, c001200o2.A00);
            if (query2 == null) {
                i = 1;
            } else {
                while (query2.moveToNext()) {
                    UserJid userJid = (UserJid) ((AbstractMap) A03).get(query2.getString(query2.getColumnIndex("raw_contact_id")));
                    int i2 = query2.getInt(query2.getColumnIndex("data2"));
                    String string = query2.getString(query2.getColumnIndex("data1"));
                    String string2 = query2.getString(query2.getColumnIndex("data3"));
                    boolean z = false;
                    if (query2.getInt(query2.getColumnIndex("is_primary")) == 1) {
                        z = true;
                    }
                    c04110Ip.A0A(i2, userJid, string, string2, z);
                }
                i = 1;
                c04110Ip.A09();
                query2.close();
            }
            ContentResolver contentResolver = c001200o2.A00.getContentResolver();
            Uri uri = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
            String[] strArr = new String[i];
            strArr[0] = obj;
            Cursor query3 = contentResolver.query(uri, null, "contact_id = ?", strArr, null);
            if (query3 != null) {
                while (query3.moveToNext()) {
                    try {
                        int i3 = query3.getInt(query3.getColumnIndex("data2"));
                        String string3 = query3.getString(query3.getColumnIndex("data1"));
                        String string4 = query3.getString(query3.getColumnIndex("data3"));
                        boolean z2 = false;
                        if (query3.getInt(query3.getColumnIndex("is_primary")) == i) {
                            z2 = true;
                        }
                        c04110Ip.A0C(i3, string3, string4, z2);
                    } finally {
                        try {
                            throw th;
                        } finally {
                            try {
                                query3.close();
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                query3.close();
            }
            String[] strArr2 = new String[2];
            strArr2[0] = "data2";
            strArr2[i] = "data1";
            Object[] objArr = new Object[2];
            objArr[0] = "contact_id";
            objArr[i] = "mimetype";
            String format = String.format("%s =? AND %s =?", objArr);
            ContentResolver contentResolver2 = c001200o2.A00.getContentResolver();
            Uri uri2 = ContactsContract.Data.CONTENT_URI;
            String[] strArr3 = new String[2];
            strArr3[0] = obj;
            strArr3[i] = "vnd.android.cursor.item/website";
            Cursor query4 = contentResolver2.query(uri2, strArr2, format, strArr3, null);
            if (query4 != null) {
                while (query4.moveToNext()) {
                    try {
                        c04110Ip.A0B(query4.getInt(query4.getColumnIndex("data2")), query4.getString(query4.getColumnIndex("data1")));
                    } finally {
                        try {
                            throw th;
                        } finally {
                            try {
                                query4.close();
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                }
                query4.close();
            }
            ContentResolver contentResolver3 = c001200o2.A00.getContentResolver();
            Uri uri3 = ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
            String[] strArr4 = new String[i];
            strArr4[0] = obj;
            Cursor query5 = contentResolver3.query(uri3, null, "contact_id = ?", strArr4, null);
            if (query5 != null) {
                while (query5.moveToNext()) {
                    try {
                        if (c04110Ip.A02 == null) {
                            c04110Ip.A02 = new ArrayList();
                        }
                        C75903fj c75903fj = new C75903fj();
                        c75903fj.A01 = ContactsContract.CommonDataKinds.StructuredPostal.class;
                        c75903fj.A00 = query5.getInt(query5.getColumnIndex("data2"));
                        c75903fj.A02 = query5.getString(query5.getColumnIndex("data1"));
                        c75903fj.A04 = new C75893fi();
                        String string5 = query5.getString(query5.getColumnIndex("data4"));
                        if (string5 != null) {
                            c75903fj.A04.A03 = string5.replaceAll("(\r\n|\r|\n|\n\r)", " ");
                        }
                        c75903fj.A04.A00 = query5.getString(query5.getColumnIndex("data7"));
                        c75903fj.A04.A02 = query5.getString(query5.getColumnIndex("data8"));
                        c75903fj.A04.A04 = query5.getString(query5.getColumnIndex("data9"));
                        c75903fj.A04.A01 = query5.getString(query5.getColumnIndex("data10"));
                        c75903fj.A03 = query5.getString(query5.getColumnIndex("data3"));
                        boolean z3 = true;
                        if (query5.getInt(query5.getColumnIndex("is_primary")) != i) {
                            z3 = false;
                        }
                        c75903fj.A05 = z3;
                        c04110Ip.A02.add(c75903fj);
                    } finally {
                        try {
                            throw th;
                        } finally {
                            try {
                                query5.close();
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                }
                query5.close();
            }
            String[] strArr5 = new String[2];
            strArr5[0] = obj;
            strArr5[i] = "vnd.android.cursor.item/organization";
            Cursor query6 = c001200o2.A00.getContentResolver().query(uri2, null, "contact_id = ? AND mimetype = ?", strArr5, null);
            if (query6 != null) {
                try {
                    if (query6.moveToFirst()) {
                        String string6 = query6.getString(query6.getColumnIndex("data1"));
                        String string7 = query6.getString(query6.getColumnIndex("data5"));
                        StringBuilder sb = new StringBuilder();
                        sb.append(string6);
                        if (string7 == null || string7.length() == 0) {
                            str = "";
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(";");
                            sb2.append(string7);
                            str = sb2.toString();
                        }
                        sb.append(str);
                        String obj2 = sb.toString();
                        String string8 = query6.getString(query6.getColumnIndex("data4"));
                        query6.getInt(query6.getColumnIndex("is_primary"));
                        c04110Ip.A0E(obj2, string8);
                    }
                } finally {
                }
            }
            String[] strArr6 = new String[2];
            strArr6[0] = obj;
            strArr6[i] = "vnd.android.cursor.item/photo";
            ContentResolver contentResolver4 = c001200o2.A00.getContentResolver();
            String[] strArr7 = new String[i];
            strArr7[0] = "data15";
            Cursor query7 = contentResolver4.query(uri2, strArr7, "contact_id = ? AND mimetype = ? ", strArr6, null);
            if (query7 != null) {
                try {
                    if (query7.moveToFirst()) {
                        c04110Ip.A09 = query7.getBlob(0);
                    }
                    query7.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            query7.close();
                        } catch (Throwable unused5) {
                        }
                    }
                }
            }
            String[] strArr8 = new String[2];
            strArr8[0] = obj;
            strArr8[i] = "vnd.android.cursor.item/nickname";
            Cursor query8 = c001200o2.A00.getContentResolver().query(uri2, null, "contact_id = ? AND mimetype = ?", strArr8, null);
            if (query8 != null) {
                try {
                    if (query8.moveToFirst()) {
                        C55392kL c55392kL = new C55392kL();
                        c55392kL.A01 = "NICKNAME";
                        c55392kL.A02 = query8.getString(query8.getColumnIndex("data1"));
                        c04110Ip.A0F(c55392kL);
                    }
                    query8.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            query8.close();
                        } catch (Throwable unused6) {
                        }
                    }
                }
            }
            String[] strArr9 = new String[3];
            strArr9[0] = obj;
            strArr9[i] = "vnd.android.cursor.item/contact_event";
            strArr9[2] = String.valueOf(3);
            Cursor query9 = c001200o2.A00.getContentResolver().query(uri2, null, "contact_id = ? AND mimetype = ? AND data2 =? ", strArr9, null);
            if (query9 != null) {
                try {
                    if (query9.moveToFirst()) {
                        C55392kL c55392kL2 = new C55392kL();
                        c55392kL2.A01 = "BDAY";
                        String string9 = query9.getString(query9.getColumnIndex("data1"));
                        if (string9 == null) {
                            string9 = null;
                        } else {
                            try {
                                string9 = ((SimpleDateFormat) C02620Cd.A02.A01()).format(((SimpleDateFormat) C02620Cd.A00.A01()).parse(string9));
                            } catch (ParseException e) {
                                StringBuilder sb3 = new StringBuilder("Date string '");
                                sb3.append(string9);
                                sb3.append("' not in format of <MMM dd, yyyy>");
                                Log.e(sb3.toString(), e);
                            }
                        }
                        c55392kL2.A02 = string9;
                        c04110Ip.A0F(c55392kL2);
                    }
                    query9.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            query9.close();
                        } catch (Throwable unused7) {
                        }
                    }
                }
            }
            String[] strArr10 = new String[2];
            strArr10[0] = obj;
            strArr10[i] = "vnd.android.cursor.item/im";
            query6 = c001200o2.A00.getContentResolver().query(uri2, null, "contact_id = ? AND mimetype = ? ", strArr10, null);
            if (query6 != null) {
                while (query6.moveToNext()) {
                    try {
                        int i4 = query6.getInt(query6.getColumnIndex("data5"));
                        C55392kL c55392kL3 = new C55392kL();
                        c55392kL3.A02 = query6.getString(query6.getColumnIndex("data1"));
                        C002301c c002301c2 = c04110Ip.A0D;
                        String A07 = c002301c2.A07(ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(i4));
                        for (Map.Entry entry : C04110Ip.A0F.entrySet()) {
                            if (((String) entry.getValue()).equalsIgnoreCase(A07)) {
                                c55392kL3.A01 = (String) entry.getKey();
                            }
                        }
                        c55392kL3.A04.add(c002301c2.A07(ContactsContract.CommonDataKinds.Im.getTypeLabelResource(i4)).toUpperCase());
                        c04110Ip.A0F(c55392kL3);
                    } finally {
                        try {
                            throw th;
                        } finally {
                            try {
                                query6.close();
                            } catch (Throwable unused8) {
                            }
                        }
                    }
                }
                query6.close();
            }
            C43291xA.A01(c01b, c05w, c04110Ip);
            try {
                return new C43291xA(c002301c, anonymousClass031).A03(c04110Ip);
            } catch (C43301xB e2) {
                Log.e("Could not create VCard", e2);
                return null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (query2 != null) {
                    try {
                        query2.close();
                    } catch (Throwable unused9) {
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HS, X.36z] */
    public static void A01(PhoneContactsSelector phoneContactsSelector) {
        C653836z c653836z = phoneContactsSelector.A0F;
        if (c653836z != null) {
            c653836z.A05(true);
            phoneContactsSelector.A0F = null;
        }
        ?? r2 = new C0HS(phoneContactsSelector.A0L, phoneContactsSelector, phoneContactsSelector.A0Q, phoneContactsSelector.A0U) { // from class: X.36z
            public WeakReference A00;
            public final C002301c A01;
            public final ArrayList A02;
            public final List A03;

            {
                ArrayList arrayList;
                this.A01 = r2;
                this.A00 = new WeakReference(phoneContactsSelector);
                if (r4 != null) {
                    arrayList = new ArrayList(r4);
                } else {
                    arrayList = null;
                }
                this.A02 = arrayList;
                this.A03 = new ArrayList(r5);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                ArrayList arrayList = this.A02;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C2LC c2lc : this.A03) {
                        if (C09940f2.A04(c2lc.A06, arrayList, this.A01)) {
                            arrayList2.add(c2lc);
                        }
                    }
                    return arrayList2;
                }
                return this.A03;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Collection collection = (Collection) obj;
                PhoneContactsSelector phoneContactsSelector2 = (PhoneContactsSelector) this.A00.get();
                if (phoneContactsSelector2 == null || phoneContactsSelector2.AFE()) {
                    return;
                }
                phoneContactsSelector2.A0F = null;
                ArrayList arrayList = phoneContactsSelector2.A0T;
                arrayList.clear();
                arrayList.addAll(collection);
                phoneContactsSelector2.A0E.notifyDataSetChanged();
                phoneContactsSelector2.A1R();
            }
        };
        phoneContactsSelector.A0F = r2;
        phoneContactsSelector.A0O.ARy(r2, new Void[0]);
    }

    public final void A1R() {
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        if (!this.A0K.A03()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (this.A0G != null) {
            findViewById4.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.A0P)) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            ((TextView) findViewById3).setText(getString(R.string.search_no_results, this.A0P));
        } else {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(8);
        }
    }

    public final void A1S() {
        if (this.A01.getVisibility() == 0 || !this.A0S) {
            this.A02.setVisibility(8);
        } else {
            this.A02.setVisibility(0);
        }
    }

    public final void A1T(int i) {
        A0c().A0G(this.A0L.A0A(R.plurals.n_contacts_selected, i, Integer.valueOf(i)));
    }

    public final void A1U(C2LC c2lc) {
        List list;
        SelectionCheckView selectionCheckView = (SelectionCheckView) this.A03.findViewWithTag(c2lc);
        if (c2lc.A03) {
            c2lc.A03 = false;
            list = this.A0V;
            int indexOf = list.indexOf(c2lc);
            if (list.remove(c2lc)) {
                this.A0H.A04(indexOf);
            }
        } else {
            list = this.A0V;
            if (list.size() == 257) {
                ((ActivityC02290Ap) this).A0A.A0E(this.A0L.A0A(R.plurals.contact_array_message_reach_limit, 257L, 257), 1);
                if (selectionCheckView != null) {
                    selectionCheckView.A03(false, false);
                    return;
                }
                return;
            }
            TextView textView = (TextView) findViewById(R.id.search_holder).findViewById(R.id.search_src_text);
            if (textView != null) {
                textView.setText("");
            }
            c2lc.A03 = true;
            if (list.add(c2lc)) {
                this.A0H.A03(list.size() - 1);
            }
        }
        if (selectionCheckView != null) {
            selectionCheckView.A03(c2lc.A03, false);
        }
        if (list.isEmpty()) {
            this.A01.setVisibility(4);
            A1S();
            if (!this.A0S) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height));
                translateAnimation.setDuration(240L);
                translateAnimation.setAnimationListener(new Animation.AnimationListener(0) { // from class: X.2qV
                    public int A00;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    {
                        PhoneContactsSelector.this = this;
                        this.A00 = r2;
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        PhoneContactsSelector phoneContactsSelector = PhoneContactsSelector.this;
                        phoneContactsSelector.A03.clearAnimation();
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) phoneContactsSelector.A03.getLayoutParams();
                        layoutParams.setMargins(layoutParams.leftMargin, this.A00, layoutParams.rightMargin, layoutParams.bottomMargin);
                        phoneContactsSelector.A03.setLayoutParams(layoutParams);
                    }
                });
                this.A03.startAnimation(translateAnimation);
            }
        } else if (this.A01.getVisibility() != 0) {
            if (this.A02.getVisibility() != 0) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height);
                this.A01.setVisibility(0);
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, dimensionPixelSize);
                translateAnimation2.setDuration(240L);
                translateAnimation2.setAnimationListener(new Animation.AnimationListener(dimensionPixelSize) { // from class: X.2qV
                    public int A00;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    {
                        PhoneContactsSelector.this = this;
                        this.A00 = dimensionPixelSize;
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        PhoneContactsSelector phoneContactsSelector = PhoneContactsSelector.this;
                        phoneContactsSelector.A03.clearAnimation();
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) phoneContactsSelector.A03.getLayoutParams();
                        layoutParams.setMargins(layoutParams.leftMargin, this.A00, layoutParams.rightMargin, layoutParams.bottomMargin);
                        phoneContactsSelector.A03.setLayoutParams(layoutParams);
                    }
                });
                this.A03.startAnimation(translateAnimation2);
            } else {
                this.A02.setVisibility(8);
                this.A01.setVisibility(0);
            }
        } else if (c2lc.A03) {
            this.A04.A0Y(list.size() - 1);
        }
        A1T(list.size());
        if (c2lc.A02 == null) {
            this.A0O.AS1(new RunnableEBaseShape1S0200000_I0_1(this, c2lc, 3));
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public /* synthetic */ void lambda$onCreate$93$PhoneContactsSelector(View view) {
        this.A08.A01(this, 10);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (!this.A0R) {
            super.onBackPressed();
            return;
        }
        this.A0R = false;
        C000700j.A01();
        ArrayList arrayList = this.A0T;
        arrayList.clear();
        arrayList.addAll(this.A0U);
        C58032qT c58032qT = this.A0E;
        if (c58032qT != null) {
            c58032qT.notifyDataSetChanged();
        }
        this.A06.A04(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.2qT, android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0HS, X.370] */
    @Override // X.C2LB, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.multiple_contact_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            this.A0C = this.A0D.A04(this);
            this.A06 = new C07630Zb(this, this.A0L, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.36w
                @Override // X.InterfaceC07650Zd
                public boolean ANY(String str) {
                    return false;
                }

                {
                    PhoneContactsSelector.this = this;
                }

                @Override // X.InterfaceC07650Zd
                public boolean ANX(String str) {
                    PhoneContactsSelector phoneContactsSelector = PhoneContactsSelector.this;
                    phoneContactsSelector.A0P = str;
                    ArrayList A03 = C09940f2.A03(str, phoneContactsSelector.A0L);
                    phoneContactsSelector.A0Q = A03;
                    if (A03.isEmpty()) {
                        phoneContactsSelector.A0Q = null;
                    }
                    PhoneContactsSelector.A01(phoneContactsSelector);
                    return false;
                }
            });
            setTitle((int) R.string.contacts_to_send);
            this.A0M = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
            ListView A1P = A1P();
            this.A03 = A1P;
            A1P.setFastScrollAlwaysVisible(true);
            this.A03.setScrollBarStyle(33554432);
            AnonymousClass370 anonymousClass370 = this.A0G;
            if (anonymousClass370 != null) {
                anonymousClass370.A05(true);
            }
            C653836z c653836z = this.A0F;
            if (c653836z != null) {
                c653836z.A05(true);
                this.A0F = null;
            }
            ?? r8 = new C0HS(this.A0J, this.A0I, this.A0L, this.A0K, this) { // from class: X.370
                public WeakReference A00;
                public final C02E A01;
                public final C001200o A02;
                public final C02F A03;
                public final C002301c A04;

                {
                    this.A02 = r2;
                    this.A01 = r3;
                    this.A04 = r4;
                    this.A03 = r5;
                    this.A00 = new WeakReference(this);
                }

                /* JADX WARN: Code restructure failed: missing block: B:158:0x0146, code lost:
                    if (r11.equals("vnd.android.cursor.item/name") == false) goto L70;
                 */
                /* JADX WARN: Removed duplicated region for block: B:110:0x003e  */
                @Override // X.C0HS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object A07(java.lang.Object[] r15) {
                    /*
                        Method dump skipped, instructions count: 374
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass370.A07(java.lang.Object[]):java.lang.Object");
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Collection collection = (Collection) obj;
                    PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00.get();
                    if (phoneContactsSelector == null || phoneContactsSelector.AFE()) {
                        return;
                    }
                    phoneContactsSelector.A0G = null;
                    phoneContactsSelector.A0V.clear();
                    ArrayList arrayList = phoneContactsSelector.A0U;
                    arrayList.addAll(collection);
                    MenuItem menuItem = phoneContactsSelector.A00;
                    if (menuItem != null) {
                        menuItem.setVisible(!arrayList.isEmpty());
                    }
                    PhoneContactsSelector.A01(phoneContactsSelector);
                }
            };
            this.A0G = r8;
            this.A0O.ARy(r8, new Void[0]);
            List list = this.A0V;
            list.clear();
            this.A04 = (RecyclerView) findViewById(R.id.selected_items);
            final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
            this.A04.A0k(new AbstractC08920cK() { // from class: X.36x
                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
                    int i = dimensionPixelSize;
                    rect.set(0, i, 0, i);
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1Y(0);
            this.A04.setLayoutManager(linearLayoutManager);
            this.A04.setAdapter(this.A0H);
            this.A04.setItemAnimator(new C2LD());
            this.A03.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2qR
                public int A00 = 0;

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }

                {
                    PhoneContactsSelector.this = this;
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i) {
                    int i2 = this.A00;
                    if (i2 == 0 && i != i2) {
                        ((ActivityC02270An) PhoneContactsSelector.this).A0F.A01(absListView);
                    }
                    this.A00 = i;
                }
            });
            this.A03.setFastScrollEnabled(true);
            this.A03.setScrollbarFadingEnabled(true);
            if (this.A0L.A0N()) {
                this.A03.setVerticalScrollbarPosition(1);
                this.A03.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0);
            } else {
                this.A03.setVerticalScrollbarPosition(2);
                this.A03.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0);
            }
            this.A03.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2qA
                {
                    PhoneContactsSelector.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    PhoneContactsSelector phoneContactsSelector = PhoneContactsSelector.this;
                    View findViewById = view.findViewById(R.id.selection_check);
                    if (findViewById != null) {
                        phoneContactsSelector.A1U((C2LC) findViewById.getTag());
                    }
                }
            });
            A1T(list.size());
            this.A01 = findViewById(R.id.selected_list);
            if (list.isEmpty()) {
                this.A01.setVisibility(4);
            }
            this.A02 = findViewById(R.id.warning);
            TextView textView = (TextView) findViewById(R.id.warning_text);
            textView.setText("");
            this.A0S = !TextUtils.isEmpty(textView.getText());
            A1S();
            ?? r0 = new ArrayAdapter(this, this.A0T) { // from class: X.2qT
                {
                    PhoneContactsSelector.this = this;
                }

                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int i, View view, ViewGroup viewGroup) {
                    C58092qZ c58092qZ;
                    Object item = getItem(i);
                    if (item != null) {
                        C2LC c2lc = (C2LC) item;
                        if (view == null) {
                            view = PhoneContactsSelector.this.getLayoutInflater().inflate(R.layout.phone_contact_row, viewGroup, false);
                            c58092qZ = new C58092qZ(view);
                            view.setTag(c58092qZ);
                        } else {
                            c58092qZ = (C58092qZ) view.getTag();
                        }
                        PhoneContactsSelector phoneContactsSelector = PhoneContactsSelector.this;
                        C0L7 c0l7 = phoneContactsSelector.A0A;
                        ImageView imageView = c58092qZ.A00;
                        c0l7.A05(imageView, R.drawable.avatar_contact);
                        phoneContactsSelector.A0C.A01(c2lc, imageView);
                        c58092qZ.A01.A06(c2lc.A06, phoneContactsSelector.A0Q, false, 0);
                        SelectionCheckView selectionCheckView = c58092qZ.A03;
                        selectionCheckView.A03(c2lc.A03, false);
                        selectionCheckView.setTag(c2lc);
                        return view;
                    }
                    throw null;
                }
            };
            this.A0E = r0;
            A1Q(r0);
            View findViewById = findViewById(R.id.next_btn);
            if (findViewById != null) {
                ImageView imageView = (ImageView) findViewById;
                imageView.setImageDrawable(new C0We(this.A0L, C02160Ac.A03(this, R.drawable.ic_fab_next)));
                imageView.setContentDescription(getString(R.string.next));
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 30));
                ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 5));
                findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 31));
                registerForContextMenu(this.A03);
                if (bundle == null && !this.A0K.A03()) {
                    RequestPermissionActivity.A04(this, R.string.permission_contacts_access_on_new_group_request, R.string.permission_contacts_access_on_new_group);
                }
                A1R();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: X.2qS
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return true;
            }

            {
                PhoneContactsSelector.this = this;
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                PhoneContactsSelector phoneContactsSelector = PhoneContactsSelector.this;
                phoneContactsSelector.A0Q = null;
                PhoneContactsSelector.A01(phoneContactsSelector);
                return true;
            }
        });
        this.A00.setVisible(!this.A0U.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C653836z c653836z = this.A0F;
        if (c653836z != null) {
            c653836z.A05(true);
            this.A0F = null;
        }
        AnonymousClass370 anonymousClass370 = this.A0G;
        if (anonymousClass370 != null) {
            anonymousClass370.A05(true);
            this.A0G = null;
        }
        this.A0U.clear();
        this.A0T.clear();
        this.A0C.A00();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A06.A01();
        this.A0R = true;
        return false;
    }
}
