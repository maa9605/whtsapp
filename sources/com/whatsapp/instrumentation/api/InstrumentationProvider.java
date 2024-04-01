package com.whatsapp.instrumentation.api;

import X.AbstractC005302j;
import X.AnonymousClass060;
import X.AnonymousClass061;
import X.C000200d;
import X.C000700j;
import X.C002501g;
import X.C003101m;
import X.C00C;
import X.C00E;
import X.C00G;
import X.C011005l;
import X.C018708s;
import X.C02180Ae;
import X.C05G;
import X.C06C;
import X.C07F;
import X.C0C5;
import X.C0C7;
import X.C0CD;
import X.C0HC;
import X.C40351s4;
import X.C40361s5;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class InstrumentationProvider extends ContentProvider {
    public C00C A00;
    public C40351s4 A01;
    public C00E A02;
    public C00G A03;
    public C05G A04;
    public boolean A05;

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    public final C07F A00(Uri uri) {
        synchronized (this) {
            if (!this.A05) {
                Context context = getContext();
                if (context != null) {
                    C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
                    this.A02 = c0c5.A1A();
                    this.A00 = c0c5.A18();
                    this.A03 = c0c5.A1B();
                    this.A04 = c0c5.A1V();
                    this.A01 = c0c5.A19();
                    this.A05 = true;
                } else {
                    throw new IllegalStateException("Context is not attached.");
                }
            }
        }
        if (this.A00.A01()) {
            C07F A01 = this.A03.A01();
            if (this.A04.A02()) {
                synchronized (this.A00) {
                }
                if (Binder.getCallingUid() != Process.myUid()) {
                    String A03 = this.A02.A03(A01.A01);
                    String queryParameter = uri.getQueryParameter("authorization_token");
                    if (TextUtils.isEmpty(A03) || !A03.equals(queryParameter)) {
                        throw new SecurityException("Access denied: auth token is missing");
                    }
                    return A01;
                }
                throw new SecurityException("Access checks is executed outside of binder context.");
            }
            throw new SecurityException("WhatsApp is not active.");
        }
        throw new SecurityException("Feature is disabled.");
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, Bundle bundle) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        A00(uri);
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, final String[] strArr, String str, String[] strArr2, String str2) {
        final C07F A00 = A00(uri);
        C40351s4 c40351s4 = this.A01;
        if (c40351s4.A00.match(uri) != 1) {
            throw new SecurityException(C000200d.A0G("Access denied to ", uri));
        }
        C40361s5 c40361s5 = (C40361s5) c40351s4.A01.get();
        if (c40361s5 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AnonymousClass060 anonymousClass060 = c40361s5.A01.A05;
                if (anonymousClass060 != null) {
                    C0HC A06 = AnonymousClass061.A06();
                    ArrayList arrayList = new ArrayList();
                    C0CD A0A = anonymousClass060.A0A();
                    Cursor A05 = AnonymousClass061.A05(A0A, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", AnonymousClass060.A07, null, null, null, "CONTACTS");
                    try {
                        if (A05 == null) {
                            C000700j.A08(false, "contact-mgr-db/unable to get all db contacts");
                            A0A.close();
                        } else {
                            int count = A05.getCount();
                            while (A05.moveToNext()) {
                                try {
                                    arrayList.add(C002501g.A04(A05));
                                } catch (IllegalStateException e) {
                                    if (e.getMessage() != null && e.getMessage().contains("Make sure the Cursor is initialized correctly before accessing data from it")) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("contactmanagerdb/getAllDBContacts/illegal-state-exception/cursor count=");
                                        sb.append(count);
                                        sb.append("; ");
                                        sb.append("partial list size=");
                                        sb.append(arrayList.size());
                                        String obj = sb.toString();
                                        if (obj != null) {
                                            Log.e(obj, e);
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw e;
                                    }
                                }
                            }
                            A05.close();
                            A0A.close();
                            anonymousClass060.A0U(arrayList);
                            arrayList.size();
                            A06.A00();
                        }
                        final ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C06C c06c = (C06C) it.next();
                            if (c40361s5.A05.A02(c06c)) {
                                if (c40361s5.A04 != null) {
                                    if (c06c.A03(AbstractC005302j.class) != null && c06c.A0X && !c06c.A0D() && !c40361s5.A00.A0A(c06c.A02()) && C003101m.A0O(c06c.A02())) {
                                        if (c06c.A0C()) {
                                            Jid A02 = c06c.A02();
                                            if (A02 instanceof C011005l) {
                                                if (!(!c40361s5.A03.A05((GroupJid) A02))) {
                                                }
                                            }
                                        }
                                        if (!TextUtils.isEmpty(c40361s5.A02.A09(c06c, false))) {
                                            arrayList2.add(c06c);
                                        }
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        }
                        final C018708s c018708s = c40361s5.A02;
                        final C0C7 c0c7 = c40361s5.A04;
                        return new AbstractCursor(strArr, arrayList2, c018708s, A00, c0c7) { // from class: X.1s7
                            public final int A00;
                            public final int A01;
                            public final int A02;
                            public final C018708s A03;
                            public final C0C7 A04;
                            public final C07F A05;
                            public final List A06;
                            public final String[] A07;

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public boolean isNull(int i) {
                                return false;
                            }

                            {
                                this.A07 = strArr == null ? new String[]{"_id", "display_name", "is_group"} : strArr;
                                this.A06 = new ArrayList(arrayList2);
                                this.A03 = c018708s;
                                this.A05 = A00;
                                this.A04 = c0c7;
                                String[] strArr3 = this.A07;
                                int i = 0;
                                while (true) {
                                    if (i >= strArr3.length) {
                                        i = -1;
                                        break;
                                    } else if (strArr3[i].equals("_id")) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                this.A01 = i;
                                String[] strArr4 = this.A07;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= strArr4.length) {
                                        i2 = -1;
                                        break;
                                    } else if (strArr4[i2].equals("display_name")) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                this.A00 = i2;
                                String[] strArr5 = this.A07;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= strArr5.length) {
                                        i3 = -1;
                                        break;
                                    } else if (strArr5[i3].equals("is_group")) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                this.A02 = i3;
                            }

                            public final C06C A00(int i) {
                                if (i >= 0) {
                                    List list = this.A06;
                                    if (i < list.size()) {
                                        return (C06C) list.get(i);
                                    }
                                }
                                StringBuilder A0Q = C000200d.A0Q("Position: ", i, ", size = ");
                                A0Q.append(this.A06.size());
                                throw new IllegalStateException(A0Q.toString());
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public String[] getColumnNames() {
                                return this.A07;
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public int getCount() {
                                return this.A06.size();
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public double getDouble(int i) {
                                throw new UnsupportedOperationException();
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public float getFloat(int i) {
                                throw new UnsupportedOperationException();
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public int getInt(int i) {
                                if (i != -1) {
                                    C06C A002 = A00(getPosition());
                                    if (i == this.A02) {
                                        return A002.A0C() ? 1 : 0;
                                    }
                                    throw new IllegalStateException(C000200d.A0E("Column #", i, " is not an int."));
                                }
                                throw new IllegalStateException("Invalid column index");
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public long getLong(int i) {
                                throw new UnsupportedOperationException();
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public short getShort(int i) {
                                throw new UnsupportedOperationException();
                            }

                            @Override // android.database.AbstractCursor, android.database.Cursor
                            public String getString(int i) {
                                if (i != -1) {
                                    C06C A002 = A00(getPosition());
                                    if (i == this.A01) {
                                        C0C7 c0c72 = this.A04;
                                        C07F c07f = this.A05;
                                        if (c0c72 != null) {
                                            Jid A03 = A002.A03(AbstractC005302j.class);
                                            if (A03 != null) {
                                                return c0c72.A01.A04(c07f, A03.getRawString());
                                            }
                                            return null;
                                        }
                                        throw null;
                                    } else if (i == this.A00) {
                                        return this.A03.A09(A002, false);
                                    } else {
                                        if (i == this.A02) {
                                            return Integer.toString(getInt(i));
                                        }
                                        throw new IllegalStateException(C000200d.A0E("Column #", i, " is not a string."));
                                    }
                                }
                                throw new IllegalStateException("Invalid column index");
                            }
                        };
                    } finally {
                    }
                } else {
                    throw null;
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } else {
            throw null;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A00(uri);
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00(uri);
        throw new UnsupportedOperationException();
    }
}
