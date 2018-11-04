class Logger:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.logs = dict()

    def shouldPrintMessage(self, timestamp, message):
        """
        Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity.
        :type timestamp: int
        :type message: str
        :rtype: bool
        """
        if message not in self.logs or timestamp - self.logs[message] >= 10:
            self.logs[message] = timestamp
            return True
        return False