package com.google.android.search.verification.client;

import X.C005402l;
import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.search.verification.api.ISearchActionVerificationService;

/* loaded from: classes.dex */
public abstract class SearchActionVerificationClientService extends IntentService {
    public static final int CONNECTION_TIMEOUT_IN_MS = 1000;
    public static final String EXTRA_INTENT = "SearchActionVerificationClientExtraIntent";
    public static final long MS_TO_NS = 1000000;
    public static final String NOTIFICATION_CHANNEL_ID = "Assistant_verifier";
    public static final int NOTIFICATION_ID = 10000;
    public static final String REMOTE_ASSISTANT_GO_SERVICE_ACTION = "com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE";
    public static final String REMOTE_GSA_SERVICE_ACTION = "com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE";
    public static final String SEND_MESSAGE_ERROR_MESSAGE = "com.google.android.voicesearch.extra.ERROR_MESSAGE";
    public static final String SEND_MESSAGE_RESULT_RECEIVER = "com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER";
    public static final String TAG = "SAVerificationClientS";
    public static final int TIME_TO_SLEEP_IN_MS = 50;
    public final Intent assistantGoServiceIntent;
    public SearchActionVerificationServiceConnection assistantGoVerificationServiceConnection;
    public final long connectionTimeout;
    public final boolean dbg;
    public final Intent gsaServiceIntent;
    public SearchActionVerificationServiceConnection searchActionVerificationServiceConnection;

    public long getConnectionTimeout() {
        return 1000L;
    }

    public boolean isTestingMode() {
        return false;
    }

    public abstract void performAction(Intent intent, boolean isVerified, Bundle options);

    /* loaded from: classes.dex */
    public class SearchActionVerificationServiceConnection implements ServiceConnection {
        public ISearchActionVerificationService iRemoteService;

        public SearchActionVerificationServiceConnection() {
        }

        public ISearchActionVerificationService getRemoteService() {
            return this.iRemoteService;
        }

        public static boolean isConnected(SearchActionVerificationServiceConnection searchActionVerificationServiceConnection) {
            return searchActionVerificationServiceConnection.iRemoteService != null;
        }

        public boolean isVerified(Intent intent, Bundle options) {
            ISearchActionVerificationService iSearchActionVerificationService = this.iRemoteService;
            return iSearchActionVerificationService != null && iSearchActionVerificationService.isSearchAction(intent, options);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder binder) {
            if (SearchActionVerificationClientService.this.dbg) {
                Log.d(SearchActionVerificationClientService.TAG, "onServiceConnected");
            }
            this.iRemoteService = ISearchActionVerificationService.Stub.asInterface(binder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.iRemoteService = null;
            if (SearchActionVerificationClientService.this.dbg) {
                Log.d(SearchActionVerificationClientService.TAG, "onServiceDisconnected");
            }
        }
    }

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
        this.gsaServiceIntent = new Intent(REMOTE_GSA_SERVICE_ACTION).setPackage(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE);
        this.assistantGoServiceIntent = new Intent(REMOTE_ASSISTANT_GO_SERVICE_ACTION).setPackage(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE);
        this.dbg = isDebugMode();
        this.connectionTimeout = 1000L;
    }

    private void createChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, getApplicationContext().getResources().getString(R.string.google_assistant_verification_channel_name), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r11.assistantGoVerificationServiceConnection) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r11.searchActionVerificationServiceConnection) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean installedServicesConnected() {
        /*
            r11 = this;
            java.lang.String r3 = "com.google.android.googlequicksearchbox"
            boolean r2 = r11.isPackageInstalled(r3)
            r10 = 0
            r9 = 1
            if (r2 == 0) goto L13
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r11.searchActionVerificationServiceConnection
            boolean r0 = com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r0)
            r8 = 0
            if (r0 == 0) goto L14
        L13:
            r8 = 1
        L14:
            boolean r0 = r11.dbg
            r7 = 2
            r6 = 3
            java.lang.String r5 = "SAVerificationClientS"
            if (r0 == 0) goto L3b
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r10] = r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1[r9] = r0
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r11.searchActionVerificationServiceConnection
            boolean r0 = com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r7] = r0
            java.lang.String r0 = "GSA app %s installed: %s connected %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.d(r5, r0)
        L3b:
            java.lang.String r4 = "com.google.android.apps.assistant"
            boolean r3 = r11.isPackageInstalled(r4)
            if (r3 == 0) goto L4c
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r11.assistantGoVerificationServiceConnection
            boolean r0 = com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r0)
            r2 = 0
            if (r0 == 0) goto L4d
        L4c:
            r2 = 1
        L4d:
            boolean r0 = r11.dbg
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r10] = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1[r9] = r0
            com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection r0 = r11.assistantGoVerificationServiceConnection
            boolean r0 = com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection.isConnected(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r7] = r0
            java.lang.String r0 = "AssistantGo app %s installed: %s connected %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.d(r5, r0)
        L70:
            if (r8 == 0) goto L75
            if (r2 == 0) goto L75
            r10 = 1
        L75:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.installedServicesConnected():boolean");
    }

    private boolean isDebugMode() {
        return !"user".equals(Build.TYPE);
    }

    private boolean isPackageInstalled(String packageName) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
                return false;
            }
            return applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, String.format("Couldn't find package name %s", packageName), e);
            return false;
        }
    }

    private boolean isPackageSafe(String packageName) {
        if (isPackageInstalled(packageName)) {
            return isDebugMode() || SearchActionVerificationClientUtil.isPackageGoogleSigned(this, packageName);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean maybePerformActionIfVerified(java.lang.String r9, android.content.Intent r10, com.google.android.search.verification.client.SearchActionVerificationClientService.SearchActionVerificationServiceConnection r11) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.maybePerformActionIfVerified(java.lang.String, android.content.Intent, com.google.android.search.verification.client.SearchActionVerificationClientService$SearchActionVerificationServiceConnection):boolean");
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.dbg) {
            Log.d(TAG, "onCreate");
        }
        super.onCreate();
        this.searchActionVerificationServiceConnection = new SearchActionVerificationServiceConnection();
        if (isPackageSafe(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE)) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new SearchActionVerificationServiceConnection();
        if (isPackageSafe(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE)) {
            bindService(this.assistantGoServiceIntent, this.assistantGoVerificationServiceConnection, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            postForegroundNotification();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.dbg) {
            Log.d(TAG, "onDestroy");
        }
        super.onDestroy();
        SearchActionVerificationServiceConnection searchActionVerificationServiceConnection = this.searchActionVerificationServiceConnection;
        if (SearchActionVerificationServiceConnection.isConnected(searchActionVerificationServiceConnection)) {
            unbindService(searchActionVerificationServiceConnection);
        }
        SearchActionVerificationServiceConnection searchActionVerificationServiceConnection2 = this.assistantGoVerificationServiceConnection;
        if (SearchActionVerificationServiceConnection.isConnected(searchActionVerificationServiceConnection2)) {
            unbindService(searchActionVerificationServiceConnection2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            if (this.dbg) {
                Log.d(TAG, "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (!installedServicesConnected() && System.nanoTime() - nanoTime < this.connectionTimeout * MS_TO_NS) {
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                if (this.dbg) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 33);
                    sb.append("Unexpected InterruptedException: ");
                    sb.append(valueOf);
                    Log.d(TAG, sb.toString());
                }
            }
        }
        if (maybePerformActionIfVerified(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE, intent, this.searchActionVerificationServiceConnection)) {
            Log.i(TAG, "Verified the intent with GSA.");
            return;
        }
        Log.i(TAG, "Unable to verify the intent with GSA.");
        if (maybePerformActionIfVerified(SearchActionVerificationClientUtil.ASSISTANT_GO_PACKAGE, intent, this.assistantGoVerificationServiceConnection)) {
            Log.i(TAG, "Verified the intent with Assistant Go.");
        } else {
            Log.i(TAG, "Unable to verify the intent with Assistant Go.");
        }
    }

    public void postForegroundNotification() {
        createChannel();
        C005402l c005402l = new C005402l(getApplicationContext(), NOTIFICATION_CHANNEL_ID);
        c005402l.A0K = NOTIFICATION_CHANNEL_ID;
        c005402l.A0A(getApplicationContext().getResources().getString(R.string.google_assistant_verification_notification_title));
        c005402l.A07.icon = 17301545;
        c005402l.A03 = -2;
        c005402l.A06 = 1;
        startForeground(NOTIFICATION_ID, c005402l.A01());
    }
}
