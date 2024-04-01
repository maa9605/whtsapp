package com.google.android.gms.auth.api.signin;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import X.C30391aU;
import X.InterfaceC227313s;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends C08G implements InterfaceC227313s, ReflectedParcelable {
    public static Comparator A09;
    public static final GoogleSignInOptions A0A;
    public static final Scope A0B = new Scope("profile");
    public static final Scope A0C;
    public static final Scope A0D;
    public static final Scope A0E;
    public static final Parcelable.Creator CREATOR;
    public Account A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public final int A05;
    public final ArrayList A06;
    public final boolean A07;
    public final boolean A08;

    static {
        C07K.A1V("email", "scopeUri must not be null or empty");
        A0C = new Scope("openid");
        A0D = new Scope("https://www.googleapis.com/auth/games_lite");
        A0E = new Scope("https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(A0C);
        hashSet.add(A0B);
        if (hashSet.contains(A0E) && hashSet.contains(A0D)) {
            hashSet.remove(A0D);
        }
        A0A = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        Scope scope = A0D;
        hashSet2.add(scope);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(A0E) && hashSet2.contains(scope)) {
            hashSet2.remove(scope);
        }
        new ArrayList(hashSet2);
        new ArrayList(hashMap2.values());
        CREATOR = new Parcelable.Creator() { // from class: X.13e
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int A092 = C07K.A09(parcel);
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                Account account = null;
                String str = null;
                String str2 = null;
                int i = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < A092) {
                    int readInt = parcel.readInt();
                    switch (65535 & readInt) {
                        case 1:
                            i = C07K.A0A(parcel, readInt);
                            break;
                        case 2:
                            arrayList2 = C07K.A0z(parcel, readInt, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) C07K.A0W(parcel, readInt, Account.CREATOR);
                            break;
                        case 4:
                            z = C07K.A1i(parcel, readInt);
                            break;
                        case 5:
                            z2 = C07K.A1i(parcel, readInt);
                            break;
                        case 6:
                            z3 = C07K.A1i(parcel, readInt);
                            break;
                        case 7:
                            str = C07K.A0u(parcel, readInt);
                            break;
                        case 8:
                            str2 = C07K.A0u(parcel, readInt);
                            break;
                        case 9:
                            arrayList = C07K.A0z(parcel, readInt, C30391aU.CREATOR);
                            break;
                        default:
                            C07K.A1H(parcel, readInt);
                            break;
                    }
                }
                C07K.A1G(parcel, A092);
                return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.A00(arrayList));
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new GoogleSignInOptions[i];
            }
        };
        A09 = new Comparator() { // from class: X.13d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Scope) obj).A01.compareTo(((Scope) obj2).A01);
            }
        };
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.A05 = i;
        this.A06 = arrayList;
        this.A00 = account;
        this.A04 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = new ArrayList(map.values());
    }

    public static Map A00(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30391aU c30391aU = (C30391aU) it.next();
            hashMap.put(Integer.valueOf(c30391aU.A00), c30391aU);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x003a, code lost:
        if (r6.A00 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A01) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L4
            return r4
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6     // Catch: java.lang.ClassCastException -> L75
            java.util.ArrayList r0 = r5.A03     // Catch: java.lang.ClassCastException -> L75
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L75
            if (r0 > 0) goto L75
            java.util.ArrayList r0 = r6.A03     // Catch: java.lang.ClassCastException -> L75
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L75
            if (r0 > 0) goto L75
            java.util.ArrayList r3 = r5.A06     // Catch: java.lang.ClassCastException -> L75
            int r2 = r3.size()     // Catch: java.lang.ClassCastException -> L75
            java.util.ArrayList r1 = r6.A06     // Catch: java.lang.ClassCastException -> L75
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L75
            r0.<init>(r1)     // Catch: java.lang.ClassCastException -> L75
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L75
            if (r2 != r0) goto L75
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L75
            r0.<init>(r1)     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = r3.containsAll(r0)     // Catch: java.lang.ClassCastException -> L75
            if (r0 == 0) goto L75
            android.accounts.Account r1 = r5.A00     // Catch: java.lang.ClassCastException -> L75
            if (r1 != 0) goto L6a
            android.accounts.Account r0 = r6.A00     // Catch: java.lang.ClassCastException -> L75
            if (r0 != 0) goto L75
        L3c:
            java.lang.String r0 = r5.A01     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L75
            if (r0 == 0) goto L5f
            java.lang.String r0 = r6.A01     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L75
            if (r0 == 0) goto L75
        L4c:
            boolean r1 = r5.A07     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = r6.A07     // Catch: java.lang.ClassCastException -> L75
            if (r1 != r0) goto L75
            boolean r1 = r5.A04     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = r6.A04     // Catch: java.lang.ClassCastException -> L75
            if (r1 != r0) goto L75
            boolean r1 = r5.A08     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = r6.A08     // Catch: java.lang.ClassCastException -> L75
            if (r1 != r0) goto L75
            goto L73
        L5f:
            java.lang.String r1 = r5.A01     // Catch: java.lang.ClassCastException -> L75
            java.lang.String r0 = r6.A01     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L75
            if (r0 == 0) goto L75
            goto L4c
        L6a:
            android.accounts.Account r0 = r6.A00     // Catch: java.lang.ClassCastException -> L75
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L75
            if (r0 == 0) goto L75
            goto L3c
        L73:
            r0 = 1
            return r0
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A06;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).A01);
        }
        Collections.sort(arrayList);
        Account account = this.A00;
        int hashCode = (arrayList.hashCode() + 31) * 31;
        int hashCode2 = account == null ? 0 : account.hashCode();
        String str = this.A01;
        return ((((((((hashCode + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A05);
        AnonymousClass088.A1O(parcel, 2, new ArrayList(this.A06), false);
        AnonymousClass088.A1L(parcel, 3, this.A00, i, false);
        AnonymousClass088.A1P(parcel, 4, this.A04);
        AnonymousClass088.A1P(parcel, 5, this.A08);
        AnonymousClass088.A1P(parcel, 6, this.A07);
        AnonymousClass088.A1M(parcel, 7, this.A01, false);
        AnonymousClass088.A1M(parcel, 8, this.A02, false);
        AnonymousClass088.A1O(parcel, 9, this.A03, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
