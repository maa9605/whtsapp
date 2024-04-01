package X;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0Na */
/* loaded from: classes.dex */
public abstract class AbstractServiceC05030Na extends Service {
    public static final Object A05 = new Object();
    public static final HashMap A06 = new HashMap();
    public AsyncTaskC12710jw A00;
    public InterfaceC12720jx A01;
    public AbstractC12740jz A02;
    public boolean A03 = false;
    public final ArrayList A04;

    public boolean A04() {
        return true;
    }

    public abstract void A05(Intent intent);

    public AbstractServiceC05030Na() {
        if (Build.VERSION.SDK_INT < 26) {
            this.A04 = new ArrayList();
        }
    }

    public static void A00(Context context, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (A05) {
                HashMap hashMap = A06;
                AbstractC12740jz abstractC12740jz = (AbstractC12740jz) hashMap.get(componentName);
                if (abstractC12740jz == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        abstractC12740jz = new AbstractC12740jz(context, componentName, i) { // from class: X.1T4
                            public final JobInfo A00;
                            public final JobScheduler A01;

                            {
                                super(componentName);
                                A03(i);
                                this.A00 = new JobInfo.Builder(i, this.A02).setOverrideDeadline(0L).build();
                                this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
                            }

                            @Override // X.AbstractC12740jz
                            public void A04(Intent intent2) {
                                this.A01.enqueue(this.A00, new JobWorkItem(intent2));
                            }
                        };
                    } else {
                        abstractC12740jz = new C1T0(context, componentName);
                    }
                    hashMap.put(componentName, abstractC12740jz);
                }
                abstractC12740jz.A03(i);
                abstractC12740jz.A04(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public InterfaceC12730jy A01() {
        InterfaceC12720jx interfaceC12720jx = this.A01;
        if (interfaceC12720jx != null) {
            C1T3 c1t3 = (C1T3) interfaceC12720jx;
            synchronized (c1t3.A02) {
                JobParameters jobParameters = c1t3.A00;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(c1t3.A01.getClassLoader());
                    return new InterfaceC12730jy(dequeueWork) { // from class: X.1T2
                        public final JobWorkItem A00;

                        {
                            this.A00 = dequeueWork;
                        }

                        @Override // X.InterfaceC12730jy
                        public void A6L() {
                            C1T3 c1t32 = C1T3.this;
                            synchronized (c1t32.A02) {
                                JobParameters jobParameters2 = c1t32.A00;
                                if (jobParameters2 != null) {
                                    jobParameters2.completeWork(this.A00);
                                }
                            }
                        }

                        @Override // X.InterfaceC12730jy
                        public Intent getIntent() {
                            return this.A00.getIntent();
                        }
                    };
                }
                return null;
            }
        }
        ArrayList arrayList = this.A04;
        synchronized (arrayList) {
            if (arrayList.size() > 0) {
                return (InterfaceC12730jy) arrayList.remove(0);
            }
            return null;
        }
    }

    public void A02() {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A00 = null;
                if (arrayList.size() > 0) {
                    A03(false);
                } else if (!this.A03) {
                    this.A02.A00();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0jw] */
    public void A03(boolean z) {
        if (this.A00 == null) {
            this.A00 = new AsyncTask() { // from class: X.0jw
                {
                    AbstractServiceC05030Na.this = this;
                }

                @Override // android.os.AsyncTask
                public Object doInBackground(Object[] objArr) {
                    while (true) {
                        AbstractServiceC05030Na abstractServiceC05030Na = AbstractServiceC05030Na.this;
                        InterfaceC12730jy A01 = abstractServiceC05030Na.A01();
                        if (A01 == null) {
                            return null;
                        }
                        abstractServiceC05030Na.A05(A01.getIntent());
                        A01.A6L();
                    }
                }

                @Override // android.os.AsyncTask
                public void onCancelled(Object obj) {
                    AbstractServiceC05030Na.this.A02();
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Object obj) {
                    AbstractServiceC05030Na.this.A02();
                }
            };
            AbstractC12740jz abstractC12740jz = this.A02;
            if (abstractC12740jz != null && z) {
                abstractC12740jz.A01();
            }
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC12720jx interfaceC12720jx = this.A01;
        if (interfaceC12720jx != null) {
            return ((JobServiceEngine) interfaceC12720jx).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01 = new C1T3(this);
            this.A02 = null;
            return;
        }
        this.A01 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = A06;
        AbstractC12740jz abstractC12740jz = (AbstractC12740jz) hashMap.get(componentName);
        if (abstractC12740jz == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            abstractC12740jz = new C1T0(this, componentName);
            hashMap.put(componentName, abstractC12740jz);
        }
        this.A02 = abstractC12740jz;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A03 = true;
                this.A02.A00();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            this.A02.A02();
            synchronized (arrayList) {
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new InterfaceC12730jy(intent, i2) { // from class: X.1T1
                    public final int A00;
                    public final Intent A01;

                    {
                        AbstractServiceC05030Na.this = this;
                        this.A01 = intent;
                        this.A00 = i2;
                    }

                    @Override // X.InterfaceC12730jy
                    public void A6L() {
                        AbstractServiceC05030Na.this.stopSelf(this.A00);
                    }

                    @Override // X.InterfaceC12730jy
                    public Intent getIntent() {
                        return this.A01;
                    }
                });
                A03(true);
            }
            return 3;
        }
        return 2;
    }
}
