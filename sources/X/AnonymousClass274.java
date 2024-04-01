package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.274  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass274 implements C0EK {
    public static volatile AnonymousClass274 A01;
    public final C41951um A00;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{216};
    }

    public AnonymousClass274(C41951um c41951um) {
        this.A00 = c41951um;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        C2A7 c2a7;
        int i2;
        int i3;
        if (i == 216) {
            List<C2A7> list = (List) message.obj;
            C41951um c41951um = this.A00;
            if (c41951um != null) {
                StringBuilder A0P = C000200d.A0P("UserNoticeManager/onUserNoticeListReceived/serverUserNoticeList size: ");
                A0P.append(list.size());
                Log.i(A0P.toString());
                C2A6 c2a6 = c41951um.A08;
                TreeMap A04 = c2a6.A04();
                ArrayList arrayList = new ArrayList();
                for (C2A7 c2a72 : list) {
                    C2A7 c2a73 = (C2A7) A04.get(Integer.valueOf(c2a72.A00));
                    if (c2a73 == null) {
                        Log.i("UserNoticeManager/getUpdatedUserNoticeList/new notice");
                        arrayList.add(c2a72);
                    } else {
                        int i4 = c2a73.A01;
                        int i5 = c2a72.A01;
                        if (i4 < i5) {
                            StringBuilder A0P2 = C000200d.A0P("UserNoticeManager/getUpdatedUserNoticeList/client stage is stale. client stage: ");
                            A0P2.append(i4);
                            A0P2.append(" sever stage: ");
                            A0P2.append(i5);
                            Log.i(A0P2.toString());
                            arrayList.add(c2a72);
                        } else {
                            int i6 = c2a73.A02;
                            int i7 = c2a72.A02;
                            if (i6 < i7) {
                                StringBuilder A0P3 = C000200d.A0P("UserNoticeManager/getUpdatedUserNoticeList/new version available. client version: ");
                                A0P3.append(i6);
                                A0P3.append(" sever version: ");
                                A0P3.append(i7);
                                Log.i(A0P3.toString());
                                arrayList.add(new C2A7(c2a73.A00, i4, c2a73.A03, i7));
                            } else {
                                StringBuilder A0P4 = C000200d.A0P("UserNoticeManager/getUpdatedUserNoticeList/server stage is same or stale. client stage: ");
                                A0P4.append(i4);
                                A0P4.append(" sever stage: ");
                                A0P4.append(i5);
                                Log.i(A0P4.toString());
                                arrayList.add(c2a73);
                            }
                        }
                    }
                }
                C000200d.A1W(arrayList, C000200d.A0P("UserNoticeManager/onUserNoticeListReceived/updatedUserNoticeList size: "));
                c2a6.A06(arrayList);
                C2A7 A02 = c41951um.A02();
                TreeMap A042 = c2a6.A04();
                if (A042.isEmpty()) {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/notice map empty");
                    c2a7 = null;
                } else {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/found metadata");
                    Map.Entry firstEntry = A042.firstEntry();
                    if (firstEntry == null) {
                        throw null;
                    }
                    c2a7 = (C2A7) firstEntry.getValue();
                }
                if (c2a7 == null) {
                    c41951um.A04();
                    c41951um.A06();
                    return true;
                }
                c2a6.A05(c2a7);
                if (A02 != null && ((i2 = A02.A00) != (i3 = c2a7.A00) || A02.A02 < c2a7.A02)) {
                    StringBuilder A0P5 = C000200d.A0P("UserNoticeManager/deleteUserNoticeContentIfNecessary/notice mismatch: ");
                    A0P5.append(i2 != i3);
                    A0P5.append(" old version: ");
                    C000200d.A1V(A0P5, A02.A02 < c2a7.A02);
                    c41951um.A07.A04(i2);
                    c41951um.A07();
                }
                C41921uj c41921uj = c41951um.A07;
                if (c41921uj != null) {
                    int i8 = c2a7.A02;
                    int i9 = c2a7.A00;
                    int i10 = c2a7.A01;
                    C000200d.A1F(C000200d.A0R("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/notice id ", i9, " version: ", i8, " stage: "), i10);
                    if (i10 == 5) {
                        Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/end stage, skip fetch");
                    } else {
                        C003701t c003701t = c41921uj.A05;
                        if (C2A8.A01(i9, c003701t)) {
                            Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/green alert disabled");
                        } else if (!C2A8.A02(c003701t, c2a7) && !c41921uj.A09(i9, "content.json")) {
                            Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/content does not exist, fetch");
                            c41921uj.A05(i9);
                        }
                    }
                    c41951um.A08(i9, i10, i8);
                    c41951um.A0B(c2a7, c41921uj.A03(c2a7));
                    return true;
                }
                throw null;
            }
            throw null;
        }
        return false;
    }
}
