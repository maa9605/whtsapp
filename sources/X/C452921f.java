package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.21f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C452921f {
    public final AbstractC000600i A00;
    public final C001200o A01;
    public final C04Z A02;
    public volatile C453321j A03;

    public C452921f(C001200o c001200o, AbstractC000600i abstractC000600i, C04Z c04z) {
        this.A00 = abstractC000600i;
        this.A01 = c001200o;
        this.A02 = c04z;
    }

    public C453321j A00() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = new C453321j(this.A01.A00, this.A00, this.A02);
                }
            }
        }
        return this.A03;
    }

    public final List A01(boolean z, long j) {
        C453521l c453521l;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            C0CD c0cd = new C0CD(null, A00(), false);
            C0CE c0ce = c0cd.A02;
            String[] strArr = C453521l.A04;
            String[] strArr2 = new String[2];
            strArr2[0] = z ? "1" : "0";
            strArr2[1] = Long.toString(j);
            Cursor A09 = c0ce.A09("location_sharer", strArr, "from_me = ? AND expires >= ?", strArr2, "_id DESC", "getAllLocationSharers/QUERY_LOCATION_SHARER");
            if (A09 == null) {
                Log.e("LocationSharingStore/getAllLocationSharers/unable to get location sharers");
                c0cd.close();
                return arrayList;
            }
            while (A09.moveToNext()) {
                AbstractC005302j A02 = AbstractC005302j.A02(A09.getString(0));
                if (A02 != null) {
                    c453521l = new C453521l(A02, UserJid.getNullable(A09.getString(2)), A09);
                } else {
                    c453521l = null;
                }
                if (c453521l != null) {
                    arrayList.add(c453521l);
                }
            }
            A09.close();
            c0cd.close();
            StringBuilder A0P = C000200d.A0P("LocationSharingStore/getAllLocationSharers/returned ");
            A0P.append(arrayList.size());
            A0P.append(" location sharer; fromMe=");
            A0P.append(z);
            A0P.append(" | time: ");
            A0P.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(A0P.toString());
            return arrayList;
        } catch (Exception e) {
            Log.e("LocationSharingStore/getAllLocationSharers/error getting sharers", e);
            throw new RuntimeException(e);
        }
    }

    public void A02(C0K0 c0k0) {
        C0CD A00 = A00().A00();
        try {
            ContentValues contentValues = new ContentValues();
            UserJid userJid = c0k0.A06;
            contentValues.put("jid", userJid.getRawString());
            contentValues.put("latitude", Double.valueOf(c0k0.A00));
            contentValues.put("longitude", Double.valueOf(c0k0.A01));
            contentValues.put("accuracy", Integer.valueOf(c0k0.A03));
            contentValues.put("speed", Float.valueOf(c0k0.A02));
            contentValues.put("bearing", Integer.valueOf(c0k0.A04));
            contentValues.put("location_ts", Long.valueOf(c0k0.A05));
            A00.A02.A05("location_cache", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/saveUserLocation/saved user location; jid=");
            sb.append(userJid);
            sb.append("; timestamp=");
            sb.append(c0k0.A05);
            Log.i(sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A00.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A03(Collection collection) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C03790Hb A002 = A00.A00();
            try {
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += A00.A02.A01("location_cache", "jid = ?", new String[]{((UserJid) it.next()).getRawString()});
                }
                A002.A00();
                A00.close();
                StringBuilder A0Q = C000200d.A0Q("LocationSharingStore/deleteUserLocations/deleted ", i, " location sharers | time: ");
                A0Q.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(A0Q.toString());
            } finally {
            }
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteUserLocations/delete failed", e);
            throw new RuntimeException(e);
        }
    }

    public void A04(Collection collection, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C03790Hb A002 = A00.A00();
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                C453221i c453221i = (C453221i) it.next();
                for (UserJid userJid : c453221i.A03) {
                    ContentValues contentValues = new ContentValues();
                    AnonymousClass094 anonymousClass094 = c453221i.A02;
                    AbstractC005302j abstractC005302j = anonymousClass094.A00;
                    if (abstractC005302j != null) {
                        contentValues.put("remote_jid", abstractC005302j.getRawString());
                        contentValues.put("from_me", Boolean.TRUE);
                        contentValues.put("remote_resource", userJid.getRawString());
                        contentValues.put("expires", Long.valueOf(Math.min(c453221i.A01, j)));
                        contentValues.put("message_id", anonymousClass094.A01);
                        int i2 = 0;
                        if (A00.A02.A05("location_sharer", contentValues) >= 0) {
                            i2 = 1;
                        }
                        i += i2;
                    } else {
                        throw null;
                    }
                }
            }
            A002.A00();
            A002.close();
            A00.close();
            StringBuilder A0Q = C000200d.A0Q("LocationSharingStore/updateSharingExpire/update ", i, " location sharers | time: ");
            A0Q.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(A0Q.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/updateSharingExpire/save failed", e);
            throw new RuntimeException(e);
        }
    }

    public void A05(List list) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C03790Hb A01 = A00.A01();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C453521l c453521l = (C453521l) it.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("remote_jid", c453521l.A01.getRawString());
                    UserJid userJid = c453521l.A02;
                    String str = null;
                    if (userJid != null) {
                        str = userJid.getRawString();
                    }
                    contentValues.put("remote_resource", str);
                    AnonymousClass094 anonymousClass094 = c453521l.A03;
                    contentValues.put("from_me", Boolean.valueOf(anonymousClass094.A02));
                    contentValues.put("expires", Long.valueOf(c453521l.A00));
                    contentValues.put("message_id", anonymousClass094.A01);
                    A00.A02.A05("location_sharer", contentValues);
                }
                A01.A00();
                A00.close();
                StringBuilder A0P = C000200d.A0P("LocationSharingStore/saveLocationSharer/saved ");
                A0P.append(list.size());
                A0P.append(" location sharers | time: ");
                A0P.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(A0P.toString());
            } finally {
            }
        } catch (Exception e) {
            Log.e("LocationSharingStore/saveLocationSharer/save failed", e);
            throw new RuntimeException(e);
        }
    }

    public void A06(List list, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C03790Hb A002 = A00.A00();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("jid", ((UserJid) it.next()).getRawString());
                    contentValues.put("sent_to_server", Boolean.valueOf(z));
                    A00.A02.A05("location_key_distribution", contentValues);
                }
                A002.A00();
                A00.close();
                StringBuilder A0P = C000200d.A0P("LocationSharingStore/storeLocationReceiverHasKey/saved ");
                A0P.append(list.size());
                A0P.append(" location receiver has key: ");
                A0P.append(z);
                A0P.append(" | time: ");
                A0P.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(A0P.toString());
            } finally {
            }
        } catch (Exception e) {
            Log.e("LocationSharingStore/storeLocationReceiverHasKey/save failed", e);
            throw new RuntimeException(e);
        }
    }

    public final void A07(boolean z, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C0CE c0ce = A00.A02;
            String[] strArr = new String[3];
            strArr[0] = Long.toString(j);
            strArr[1] = Long.toString(0L);
            strArr[2] = z ? "1" : "0";
            int A01 = c0ce.A01("location_sharer", "expires < ? AND expires > ? AND from_me = ?", strArr);
            A00.close();
            StringBuilder A0Q = C000200d.A0Q("LocationSharingStore/deleteOldLocationSharers/deleted ", A01, " location sharers | time: ");
            A0Q.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(A0Q.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteOldLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        }
    }

    public final void A08(boolean z, AbstractC005302j abstractC005302j, Collection collection) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C03790Hb A002 = A00.A00();
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                C0CE c0ce = A00.A02;
                String[] strArr = new String[3];
                strArr[0] = abstractC005302j.getRawString();
                strArr[1] = ((UserJid) it.next()).getRawString();
                strArr[2] = z ? "1" : "0";
                i += c0ce.A01("location_sharer", "remote_jid = ? AND remote_resource = ? AND from_me = ?", strArr);
            }
            A002.A00();
            A002.close();
            A00.close();
            StringBuilder A0Q = C000200d.A0Q("LocationSharingStore/deleteLocationSharers/deleted ", i, " location sharers | time: ");
            A0Q.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(A0Q.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        }
    }

    public final void A09(boolean z, Iterable iterable) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C0CD A00 = A00().A00();
            C03790Hb A002 = A00.A00();
            try {
                Iterator it = iterable.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C0CE c0ce = A00.A02;
                    String[] strArr = new String[2];
                    strArr[0] = ((AbstractC005302j) it.next()).getRawString();
                    strArr[1] = z ? "1" : "0";
                    i += c0ce.A01("location_sharer", "remote_jid = ? AND from_me = ?", strArr);
                }
                A002.A00();
                A00.close();
                StringBuilder A0Q = C000200d.A0Q("LocationSharingStore/deleteLocationSharers/deleted ", i, " location sharers | time: ");
                A0Q.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(A0Q.toString());
            } finally {
            }
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        }
    }
}
