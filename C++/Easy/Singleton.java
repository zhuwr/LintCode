class Solution {
private:
    Solution()   
	{
	}
	static Solution* instance;
public:
    /**
     * @return: The same instance of this class every time
     */
     
    static Solution* getInstance() {
        // write your code here
        if(instance == NULL)  
			{instance = new Solution();
			}
		return instance;
    }
};
Solution* Solution::instance = 0; //类中声明的静态数据，需要再类外面再定义一次
