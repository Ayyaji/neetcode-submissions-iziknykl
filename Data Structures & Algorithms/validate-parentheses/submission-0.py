class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        top = -1 

        for ch in s:
            if ch in ['[', '{', '(']:
                st.append(ch)
                top += 1
            else:
                if top == -1:  
                    return False
                if (ch == ']' and st[top] != '[') or \
                   (ch == '}' and st[top] != '{') or \
                   (ch == ')' and st[top] != '('):
                    return False
                st.pop()
                top -= 1

        return top == -1
