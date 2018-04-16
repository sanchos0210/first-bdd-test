/Scenario: Login to google mailbox
Given the user is on the Google home page
When the user has opened mail login page
When the user has typed email 'tester.cashflow@gmail.com'
When the user has confirmed email
When the user has typed password 'testercf'
When the user click sign in button
Then the user should see own email in mailbox 'tester.cashflow@gmail.com'