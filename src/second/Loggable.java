package second;

interface Loggable {
/**
 * ��־��Ϣ���������� ��Ϣ�����桢����
 */
enum TYPE {
INFORMATION, WARNING, ERROR
};

/**
 * ���һ����־
 * 
 * @param type
 *            ��־����
 * @param logContent
 *            ��־������
 */
void addLog(Loggable.TYPE type, String logContent);

/**
 * 
 * @return ������־�ļ��е���������
 */
String readLog();
}