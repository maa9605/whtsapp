package androidx.work.impl;

import X.AbstractC15540ov;
import X.AbstractC15580oz;
import X.C000200d;
import X.C07200Xg;
import X.C15440od;
import X.C15510os;
import X.C15530ou;
import X.C15840pQ;
import X.C16570qd;
import X.C28901Ui;
import X.C29081Vb;
import X.EnumC15520ot;
import X.InterfaceC15850pR;
import X.InterfaceC15860pS;
import X.InterfaceC16910rE;
import X.InterfaceC16930rG;
import X.InterfaceC16950rI;
import X.InterfaceC16970rK;
import X.InterfaceC16980rL;
import X.InterfaceC17010rO;
import X.InterfaceC17030rQ;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC15540ov {
    public static final long A00 = TimeUnit.DAYS.toMillis(1);

    public abstract InterfaceC16910rE A06();

    public abstract InterfaceC16930rG A07();

    public abstract InterfaceC16950rI A08();

    public abstract InterfaceC16970rK A09();

    public abstract InterfaceC16980rL A0A();

    public abstract InterfaceC17010rO A0B();

    public abstract InterfaceC17030rQ A0C();

    public static WorkDatabase A00(final Context context, Executor queryExecutor, boolean useTestDatabase) {
        C15510os c15510os;
        String obj;
        if (useTestDatabase) {
            c15510os = new C15510os(context, null);
            c15510os.A07 = true;
        } else {
            c15510os = new C15510os(context, "androidx.work.workdb");
            c15510os.A01 = new InterfaceC15850pR() { // from class: X.1VQ
                @Override // X.InterfaceC15850pR
                public InterfaceC15860pS A6f(C15840pQ configuration) {
                    Context context2 = context;
                    String str = configuration.A02;
                    AbstractC15830pP abstractC15830pP = configuration.A01;
                    if (abstractC15830pP != null) {
                        if (context2 != null) {
                            if (!TextUtils.isEmpty(str)) {
                                return new C28941Un(context2, str, abstractC15830pP, true);
                            }
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                    }
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
            };
        }
        c15510os.A04 = queryExecutor;
        Object obj2 = new Object() { // from class: X.1VR
        };
        ArrayList arrayList = c15510os.A02;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c15510os.A02 = arrayList;
        }
        arrayList.add(obj2);
        c15510os.A00(C16570qd.A00);
        c15510os.A00(new AbstractC15580oz(context, 2, 3) { // from class: X.1VZ
            public final Context A00;

            {
                super(startVersion, endVersion);
                this.A00 = context;
            }

            @Override // X.AbstractC15580oz
            public void A00(InterfaceC15820pO database) {
                if (super.A00 >= 10) {
                    ((C28931Um) database).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                } else {
                    this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                }
            }
        });
        c15510os.A00(C16570qd.A01);
        c15510os.A00(C16570qd.A02);
        c15510os.A00(new AbstractC15580oz(context, 5, 6) { // from class: X.1VZ
            public final Context A00;

            {
                super(startVersion, endVersion);
                this.A00 = context;
            }

            @Override // X.AbstractC15580oz
            public void A00(InterfaceC15820pO database) {
                if (super.A00 >= 10) {
                    ((C28931Um) database).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                } else {
                    this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                }
            }
        });
        c15510os.A00(C16570qd.A03);
        c15510os.A00(C16570qd.A04);
        c15510os.A00(C16570qd.A05);
        c15510os.A00(new AbstractC15580oz(context) { // from class: X.1Va
            public final Context A00;

            {
                super(9, 10);
                this.A00 = context;
            }

            @Override // X.AbstractC15580oz
            public void A00(InterfaceC15820pO database) {
                SQLiteDatabase sQLiteDatabase = ((C28931Um) database).A00;
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context2 = this.A00;
                SharedPreferences sharedPreferences = context2.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        sQLiteDatabase.setTransactionSuccessful();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        sQLiteDatabase.setTransactionSuccessful();
                    } finally {
                    }
                }
            }
        });
        c15510os.A00(new AbstractC15580oz(context, 10, 11) { // from class: X.1VZ
            public final Context A00;

            {
                super(startVersion, endVersion);
                this.A00 = context;
            }

            @Override // X.AbstractC15580oz
            public void A00(InterfaceC15820pO database) {
                if (super.A00 >= 10) {
                    ((C28931Um) database).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                } else {
                    this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                }
            }
        });
        c15510os.A08 = false;
        c15510os.A06 = true;
        EnumC15520ot enumC15520ot = EnumC15520ot.WRITE_AHEAD_LOGGING;
        Context context2 = c15510os.A09;
        if (context2 != null) {
            Class cls = c15510os.A0B;
            if (cls != null) {
                Executor executor = c15510os.A04;
                if (executor == null && c15510os.A05 == null) {
                    Executor executor2 = C07200Xg.A02;
                    c15510os.A05 = executor2;
                    c15510os.A04 = executor2;
                } else if (executor == null) {
                    Executor executor3 = c15510os.A05;
                    if (executor3 != null) {
                        c15510os.A04 = executor3;
                    }
                } else if (c15510os.A05 == null) {
                    c15510os.A05 = executor;
                }
                InterfaceC15850pR interfaceC15850pR = c15510os.A01;
                if (interfaceC15850pR == null) {
                    interfaceC15850pR = new InterfaceC15850pR() { // from class: X.1Uo
                        @Override // X.InterfaceC15850pR
                        public InterfaceC15860pS A6f(C15840pQ c15840pQ) {
                            return new C28941Un(c15840pQ.A00, c15840pQ.A02, c15840pQ.A01, false);
                        }
                    };
                    c15510os.A01 = interfaceC15850pR;
                }
                String str = c15510os.A0C;
                C15530ou c15530ou = c15510os.A0A;
                ArrayList arrayList2 = c15510os.A02;
                boolean z = c15510os.A07;
                EnumC15520ot enumC15520ot2 = c15510os.A00;
                if (enumC15520ot2 != null) {
                    if (enumC15520ot2 == EnumC15520ot.AUTOMATIC) {
                        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                        enumC15520ot2 = (activityManager == null || (Build.VERSION.SDK_INT >= 19 && activityManager.isLowRamDevice())) ? EnumC15520ot.TRUNCATE : enumC15520ot;
                    }
                    C15440od c15440od = new C15440od(context2, str, interfaceC15850pR, c15530ou, arrayList2, z, enumC15520ot2, c15510os.A04, c15510os.A05, c15510os.A08, c15510os.A06);
                    String name = cls.getPackage().getName();
                    String canonicalName = cls.getCanonicalName();
                    boolean isEmpty = name.isEmpty();
                    if (!isEmpty) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(canonicalName.replace('.', '_'));
                    sb.append("_Impl");
                    String obj3 = sb.toString();
                    if (isEmpty) {
                        obj = obj3;
                    } else {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(name);
                            sb2.append(".");
                            sb2.append(obj3);
                            obj = sb2.toString();
                        } catch (ClassNotFoundException unused) {
                            StringBuilder A0P = C000200d.A0P("cannot find implementation for ");
                            A0P.append(cls.getCanonicalName());
                            A0P.append(". ");
                            A0P.append(obj3);
                            A0P.append(" does not exist");
                            throw new RuntimeException(A0P.toString());
                        } catch (IllegalAccessException unused2) {
                            StringBuilder A0P2 = C000200d.A0P("Cannot access the constructor");
                            A0P2.append(cls.getCanonicalName());
                            throw new RuntimeException(A0P2.toString());
                        } catch (InstantiationException unused3) {
                            StringBuilder A0P3 = C000200d.A0P("Failed to create an instance of ");
                            A0P3.append(cls.getCanonicalName());
                            throw new RuntimeException(A0P3.toString());
                        }
                    }
                    AbstractC15540ov abstractC15540ov = (AbstractC15540ov) Class.forName(obj).newInstance();
                    if (abstractC15540ov != null) {
                        C28901Ui c28901Ui = new C28901Ui(c15440od, new C29081Vb((WorkDatabase_Impl) abstractC15540ov));
                        Context context3 = c15440od.A00;
                        String str2 = c15440od.A04;
                        if (context3 != null) {
                            InterfaceC15860pS A6f = c15440od.A03.A6f(new C15840pQ(context3, str2, c28901Ui));
                            abstractC15540ov.A00 = A6f;
                            boolean z2 = c15440od.A01 == enumC15520ot;
                            A6f.AUD(z2);
                            abstractC15540ov.A01 = c15440od.A05;
                            abstractC15540ov.A02 = c15440od.A06;
                            abstractC15540ov.A03 = c15440od.A09;
                            abstractC15540ov.A04 = z2;
                            return (WorkDatabase) abstractC15540ov;
                        }
                        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                    }
                    throw null;
                }
                throw null;
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }
}
